package com.example.profiles;

import java.util.Objects;

/**
 * Assembles profiles with scattered, inconsistent validation.
 */
public class ProfileService {

    // returns a fully built profile but mutates it afterwards (bug-friendly)
    public UserProfile createMinimal(String id, String email) {
        return new UserProfile.Builder(id, email).build();

    }

    public UserProfile createWithDisplayName(String id, String email, String displayName) {
        return new UserProfile.Builder(id, email)
                .displayName(displayName)
                .build();
}
}
