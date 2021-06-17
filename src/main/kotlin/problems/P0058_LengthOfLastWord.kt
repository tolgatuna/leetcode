package problems

class P0058_LengthOfLastWord {
    fun lengthOfLastWord(s: String): Int {
        if (s.isEmpty()) return 0
        val trimmedString = s.trim()
        if (trimmedString.contains(" ")) {
            return trimmedString.substring(trimmedString.lastIndexOf(" "), trimmedString.lastIndex).length
        }
        return trimmedString.length
    }
}
