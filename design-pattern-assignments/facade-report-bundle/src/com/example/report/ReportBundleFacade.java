package com.example.report;

import java.nio.file.Path;
import java.util.Map;
import java.util.Objects;

public class ReportBundleFacade {
    private final JsonWriter jsonWriter;
    private final Zipper zipper;
    private final AuditLog auditLog;

    public ReportBundleFacade(JsonWriter jsonWriter, Zipper zipper, AuditLog auditLog) {
        this.jsonWriter = Objects.requireNonNull(jsonWriter, "jsonWriter");
        this.zipper = Objects.requireNonNull(zipper, "zipper");
        this.auditLog = Objects.requireNonNull(auditLog, "auditLog");
    }

    /**
     * Orchestrates export: write JSON → zip it → log success
     */
    public Path export(Map<String, Object> data, Path outDir, String baseName) {
        Objects.requireNonNull(data, "data");
        Objects.requireNonNull(outDir, "outDir");
        Objects.requireNonNull(baseName, "baseName");

        // Step 1: write JSON
        Path jsonFile = jsonWriter.write(data, outDir, baseName);

        // Step 2: zip it
        Path zipFile = zipper.zip(jsonFile, outDir.resolve(baseName + ".zip"));

        // Step 3: log success
        auditLog.log("exported " + zipFile);

        return zipFile;
    }
}
