package ch.diethelm.backend.service;

public class TitleNormalizer {
    public static String normalize(String title) {
        String normalized = title.trim().replaceAll("\\s+", " ");
        return normalized.substring(0, 1).toUpperCase() + normalized.substring(1);    }
}
