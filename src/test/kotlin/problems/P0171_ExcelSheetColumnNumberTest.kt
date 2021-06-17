package problems

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class P0171_ExcelSheetColumnNumberTest {

    @Test
    fun titleToNumber() {
        val excel = P0171_ExcelSheetColumnNumber()
//        assertEquals(1, excel.titleToNumber("A"))
        assertEquals(28, excel.titleToNumber("AB"))
        assertEquals(701, excel.titleToNumber("ZY"))
    }
}
