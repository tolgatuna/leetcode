package problems

class P0006_ZigZagConversion {
    fun convert(s: String, numRows: Int): String {
        var nextLine = 1
        var isRowGoingUp = true
        if(numRows <= 1) return s

        var lines = Array(numRows) { "" }
        for (index in s.indices) {
            lines[nextLine - 1] += s[index].toString()

            nextLine += if (isRowGoingUp) 1 else -1
            isRowGoingUp = if (nextLine == 1 || nextLine == numRows) !isRowGoingUp else isRowGoingUp
        }
        return lines.toLineString()
    }

}

private fun Array<String>.toLineString(): String {
    var str = ""
    for (line in this) {
        str += line.trim()
    }
    return str
}
