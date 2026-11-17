package ch.diethelm.backend.service;

public class TitleNormalizer {
    public static String normalize(String title) {
        if (title == null || title.isBlank()) {
            throw new IllegalArgumentException("Titel darf nicht leer sein");
        }
        String normalized = title.trim().replaceAll("\\s+", " ");
        return normalized.substring(0, 1).toUpperCase() + normalized.substring(1);    }
}
