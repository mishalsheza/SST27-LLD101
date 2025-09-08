package com.example.imports;

import java.nio.file.Path;
import java.util.List;

import com.example.imports.NaiveCsvReader;


public class CsvProfileImporter implements ProfileImporter {
    private final NaiveCsvReader reader;
    private final ProfileService service;

    public CsvProfileImporter(NaiveCsvReader reader, ProfileService service) {
        this.reader = reader;
        this.service = service;
    }

    @Override
    public int importFrom(Path csvFile) {
        List<String[]> rows = reader.read(csvFile);
        int successCount = 0;

        for (String[] row : rows) {
            if (row.length < 2) { // id and email at minimum
                System.out.println("Skipping row (too few columns): " + String.join(",", row));
                continue;
            }

            String id = row[0].trim();
            String email = row[1].trim();
            String displayName = row.length > 2 ? row[2].trim() : "";

            if (id.isEmpty() || email.isEmpty()) {
                System.out.println("Skipping row (missing id/email): " + String.join(",", row));
                continue;
            }

            if (!email.contains("@")) {
                System.out.println("Skipping row (bad email): " + email);
                continue;
            }

            try {
                service.createProfile(id, email, displayName);
                successCount++;
            } catch (Exception e) {
                System.out.println("Skipping row (error): " + e.getMessage());
            }
        }

        return successCount;

    
}
}