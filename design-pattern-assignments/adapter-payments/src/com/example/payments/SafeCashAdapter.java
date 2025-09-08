package com.example.payments;

import java.util.Objects;

public class SafeCashAdapter implements PaymentGateway {
    private final SafeCashClient client;

    public SafeCashAdapter(SafeCashClient client) {
        this.client = Objects.requireNonNull(client, "SafeCashClient cannot be null");
    }

    @Override
    public String charge(String customerId, int amountCents) {
        Objects.requireNonNull(customerId, "customerId cannot be null");
        SafeCashPayment payment = client.createPayment(amountCents, customerId);
        return payment.confirm();
    }
}
