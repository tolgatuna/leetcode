package problems

object SinanTestValidCreditCard {
    fun isValid(number: String): Boolean {
        val numberTrimmed = number.replace(" ", "")
        if(numberTrimmed.length <=1) return false;

        var sum = 0
        for ((i, num) in numberTrimmed.reversed().toCharArray().withIndex()) {
            sum += if(i % 2 != 0) {
                val multiple = Character.getNumericValue(num) * 2
                if(multiple > 9) multiple - 9 else multiple
            } else {
                Character.getNumericValue(num)
            }
        }

        return sum % 10 == 0;
    }
}


