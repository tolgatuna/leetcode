package problems

class P0008_StringToInteger {
    fun myAtoi(str: String): Int {
        var num = 0L
        var isPositive = true
        var trimmedStr = str.trim()
        if (trimmedStr.isEmpty()) return 0
        val first = trimmedStr.first()
        if (first == '-') {
            isPositive = false
            trimmedStr = trimmedStr.substring(1)
        }
        if (first == '+') {
            trimmedStr = trimmedStr.substring(1)
        }

        for (c in trimmedStr) {
            if (c in arrayOf('0', '1', '2', '3', '4', '5', '6', '7', '8', '9')) {
                num = num * 10L + c.toString().toLong()
                if(num > Int.MAX_VALUE)
                    break
            } else {
                break
            }
        }
        return if (isPositive) {
            if (num <= Int.MAX_VALUE)
                num.toInt()
            else
                Int.MAX_VALUE
        } else {
            if (-num >= Int.MIN_VALUE)
                -num.toInt()
            else
                Int.MIN_VALUE
        }
    }
}
