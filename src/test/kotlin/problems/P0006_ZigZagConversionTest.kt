package problems

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class P0006_ZigZagConversionTest {

    @Test
    fun testConvertForThreeLine() {
        val zigzag = P0006_ZigZagConversion()
        assertEquals("PAHNAPLSIIGYIR", zigzag.convert("PAYPALISHIRING", 3))
    }

    @Test
    fun testConvertForFourLine() {
        val zigzag = P0006_ZigZagConversion()
        assertEquals("PINALSIGYAHRPI", zigzag.convert("PAYPALISHIRING", 4))
    }

    @Test
    fun testConvertForSingleLine() {
        val zigzag = P0006_ZigZagConversion()
        assertEquals("AB", zigzag.convert("AB", 1))
    }
}
