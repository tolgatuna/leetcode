package problems

object SinanTestResistorCalculator {
    fun text(vararg input: Color): String {
        var num: String = "";
        for ((index, color) in input.withIndex()) {
            if(index != 2)
                num += color.ordinal.toString()
            else {
                var multiplier = 0;
                var unit :Unit = Unit.OHMS
                multiplier = when {
                    color.ordinal >= 9 -> {
                        unit= Unit.GIGAOHMS
                        color.ordinal - 9
                    }
                    color.ordinal >= 6 -> {
                        unit= Unit.MEGAOHMS
                        color.ordinal - 6
                    }
                    color.ordinal >= 3 -> {
                        unit= Unit.KILOOHMS
                        color.ordinal - 3
                    }
                    else -> {
                        unit= Unit.OHMS
                        color.ordinal
                    }
                }
                for (i in 1..multiplier)
                    num += "0"
                num += " $unit"
            }
        }
        return num;
    }
}

enum class Color(i:Int){
    BLACK(0),
    BROWN(1),
    RED(2),
    ORANGE(3),
    YELLOW(4),
    GREEN(5),
    BLUE(6),
    VIOLET(7),
    GREY(8),
    WHITE(9)
}

enum class Unit {
    OHMS, KILOOHMS, MEGAOHMS, GIGAOHMS, TERAOHMS, PETAOHMS, EXAOHMS
}
