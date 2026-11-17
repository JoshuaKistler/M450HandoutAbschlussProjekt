package ch.diethelm.backend.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TitleNormalizerTest {

    @Test
    void normalize_trimsSurroundingSpaces() {
        assertEquals("Zelda", TitleNormalizer.normalize(" Zelda "));
    }

    @Test
    void normalize_collapsesMultipleSpaces() {
        assertEquals("Super Mario Kart", TitleNormalizer.normalize("Super   Mario  Kart"));
    }
}