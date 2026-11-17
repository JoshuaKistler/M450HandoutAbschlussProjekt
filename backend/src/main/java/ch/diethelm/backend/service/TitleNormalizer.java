package ch.diethelm.backend.service;

public class TitleNormalizer {
    public static String normalize(String title) {
        return title.trim().replaceAll("\\s+", " ");    }
}
