package problems

import kotlin.math.abs

fun divide(dividend: Int, divisor: Int): Int {
    if (divisor == 0) return Int.MAX_VALUE
    val isNegative = dividend > 0 && divisor < 0 || dividend < 0 && divisor > 0

    val longAnswer = longDivide(abs(dividend.toLong()), abs(divisor.toLong()))
    return if (longAnswer > Int.MAX_VALUE) {
        if (isNegative) Int.MIN_VALUE else Int.MAX_VALUE
    } else {
        if (isNegative) (-longAnswer).toInt() else longAnswer.toInt()
    }
}

private fun longDivide(dividend: Long, divisor: Long): Long {
    if (dividend < divisor || dividend == 0L) return 0
    if (divisor == 1L) return dividend

    var sum = divisor
    var multiple = 1L
    while (sum + sum <= dividend) {
        sum += sum
        multiple += multiple
    }

    return multiple + longDivide(dividend - sum, divisor)
}
