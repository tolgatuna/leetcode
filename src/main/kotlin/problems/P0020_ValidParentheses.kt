package problems

import java.util.*

class P0020_ValidParentheses {
    fun isValid(s: String): Boolean {
        val startParenthesis = listOf('(', '{', '[')
        val endParentheses = listOf(')', '}', ']')
        var v = Stack<Char>()

        for (c in s) {
            if (startParenthesis.contains(c)) {
                v.push(c)
            } else if (v.size > 0) {
                val lastElement = v.pop()
                val startIndexOf = startParenthesis.indexOf(lastElement)
                val endIndexOf = endParentheses.indexOf(c)
                if (startIndexOf != endIndexOf) {
                    return false
                }
            } else {
                return false
            }
        }

        return v.size == 0
    }
}
