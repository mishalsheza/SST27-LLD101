package com.example.orders;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/**
 * Immutable Order built via Builder.
 */
public final class Order {
    private final String id;
    private final String customerEmail;
    private final List<OrderLine> lines;
    private final Integer discountPercent; // 0..100
    private final boolean expedited;
    private final String notes;

    private Order(Builder builder) {
        this.id = builder.id;
        this.customerEmail = builder.customerEmail;
        // defensive copy of lines
        this.lines = Collections.unmodifiableList(new ArrayList<>(builder.lines));
        this.discountPercent = builder.discountPercent;
        this.expedited = builder.expedited;
        this.notes = builder.notes;
    }

    public String getId() { return id; }
    public String getCustomerEmail() { return customerEmail; }
    public List<OrderLine> getLines() { return lines; }
    public Integer getDiscountPercent() { return discountPercent; }
    public boolean isExpedited() { return expedited; }
    public String getNotes() { return notes; }

    public int totalBeforeDiscount() {
        int sum = 0;
        for (OrderLine l : lines) {
            sum += l.getQuantity() * l.getUnitPriceCents();
        }
        return sum;
    }

    public int totalAfterDiscount() {
        int base = totalBeforeDiscount();
        if (discountPercent == null) return base;
        return base - (base * discountPercent / 100);
    }

    /**
     * Builder for Order.
     */
    public static class Builder {
        private final String id;
        private final String customerEmail;
        private final List<OrderLine> lines = new ArrayList<>();

        private Integer discountPercent;
        private boolean expedited;
        private String notes;

        public Builder(String id, String customerEmail, OrderLine firstLine) {
            this.id = Objects.requireNonNull(id, "id");
            this.customerEmail = Objects.requireNonNull(customerEmail, "customerEmail");
            this.lines.add(Objects.requireNonNull(firstLine, "firstLine"));
        }

        public Builder addLine(OrderLine line) {
            this.lines.add(Objects.requireNonNull(line, "line"));
            return this;
        }

        public Builder discountPercent(Integer discountPercent) {
            this.discountPercent = discountPercent;
            return this;
        }

        public Builder expedited(boolean expedited) {
            this.expedited = expedited;
            return this;
        }

        public Builder notes(String notes) {
            this.notes = notes;
            return this;
        }

        public Order build() {
            if (!PricingRules.isValidEmail(customerEmail)) {
                throw new IllegalArgumentException("Invalid email: " + customerEmail);
            }
            if (!PricingRules.isValidDiscount(discountPercent)) {
                throw new IllegalArgumentException("Invalid discount: " + discountPercent);
            }
            if (lines.isEmpty()) {
                throw new IllegalArgumentException("Order must contain at least one line");
            }
            return new Order(this);
        }
    }
}
