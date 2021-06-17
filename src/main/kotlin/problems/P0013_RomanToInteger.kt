package problems

class P0013_RomanToInteger {
    private val romanMap = mapOf(
        'I' to 1,
        'V' to 5,
        'X' to 10,
        'L' to 50,
        'C' to 100,
        'D' to 500,
        'M' to 1000
    )

    private val specificCases = mapOf(
        "IV" to 4,
        "IX" to 9,
        "XL" to 40,
        "XC" to 90,
        "CD" to 400,
        "CM" to 900
    )

    fun romanToInt(s: String): Int {
        var value = 0
        var str = s
        for (specificCase in specificCases) {
            while (str.contains(specificCase.key)) {
                value += specificCase.value
                str = str.replace(specificCase.key, "")
            }
        }
        for (c in str) {
            value += romanMap[c] ?: 0
        }

        return value
    }
}
