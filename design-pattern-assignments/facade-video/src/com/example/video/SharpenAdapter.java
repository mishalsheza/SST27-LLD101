package com.example.video;

import java.util.Objects;

/**
 * Adapts LegacySharpen to Frame[] input/output
 */
public class SharpenAdapter {
    private final LegacySharpen legacy;

    public SharpenAdapter(LegacySharpen legacy) {
        this.legacy = Objects.requireNonNull(legacy, "legacy");
    }

    /**
     * Applies sharpen to frames using legacy API
     */
    public Frame[] sharpen(Frame[] frames, int strength) {
        Objects.requireNonNull(frames, "frames");
        // Simulate handle string (in real life would convert frames → handle)
        String handle = "FRAMES_HANDLE";
        String newHandle = legacy.applySharpen(handle, strength);
        // Return same frames for simplicity
        return frames;
    }
}
