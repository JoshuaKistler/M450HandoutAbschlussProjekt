package ch.diethelm.backend.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class TitleNormalizerTest {

    @Test
    void normalize_trimsSurroundingSpaces() {
        assertEquals("Test", TitleNormalizer.normalize(" Zelda "));
    }

    @Test
    void normalize_collapsesMultipleSpaces() {
        assertEquals("Super Mario Kart", TitleNormalizer.normalize("Super   Mario  Kart"));
    }


    @Test
    void normalize_capitalizesFirstLetter() {
        assertEquals("Zelda", TitleNormalizer.normalize("zelda"));
    }

    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = {"   "})
    void normalize_rejectsNullEmptyOrBlank(String title) {
        assertThrows(IllegalArgumentException.class, () -> TitleNormalizer.normalize(title));
    }
}