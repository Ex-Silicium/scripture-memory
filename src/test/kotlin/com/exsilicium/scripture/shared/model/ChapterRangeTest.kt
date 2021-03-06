package com.exsilicium.scripture.shared.model

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class ChapterRangeTest {
    @Test fun `Chapter range default constructor`() {
        assertEquals(ChapterRange(1, 1), ChapterRange(1))
    }

    @Test fun `Require range start greater than or equal to one`() {
        assertThrows(IllegalArgumentException::class.java) { ChapterRange(-1, 1) }
    }

    @Test fun `Require range start less than or equal to end`() {
        assertThrows(IllegalArgumentException::class.java) { ChapterRange(2, 1) }
    }
}
