package problems

class P0007_ReverseInteger {
    fun reverse(x: Int): Int {
        val stringValue = x.toString()
        return try {
            if (stringValue.contains("-")) {
                (stringValue.substring(0, 1) + stringValue.substring(1).reversed()).toInt()
            } else {
                stringValue.reversed().toInt()
            }
        } catch (e: NumberFormatException) {
            0
        }
    }
}
