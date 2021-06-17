package problems

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class SinanTestResistorCalculatorTest {

    @Test
    internal fun name() {
        assertEquals("33",SinanTestResistorCalculator.text(Color.ORANGE, Color.ORANGE, Color.BLACK))
    }
}
