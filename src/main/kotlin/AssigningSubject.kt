import Color.*

fun measureColor2() = ORANGE

fun getWarmthFromSensor2() =
    when (val color = measureColor2()) {
        RED, ORANGE, YELLOW -> "WARM (red = ${color.r})"
        GREEN -> "neutral (green = ${color.g})"
        BLUE, INDIGO, VIOLET -> "cold  (blue = ${color.b})"
    }

fun main() {
    println(getWarmthFromSensor2())
}

