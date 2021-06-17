package problems

import kotlin.math.pow

class P0171_ExcelSheetColumnNumber {

    private val MAX_CHAR_VALUE = 26.0

    fun titleToNumber(s: String): Int {
        var value = 0

        for (i in s.indices) {
            value += getCharValue(s[i]).times(MAX_CHAR_VALUE.pow(s.length - 1 - i).toInt())
        }
        return value
    }

    private fun getCharValue(c: Char): Int {
        return c.toInt() - 65 + 1
    }
}
