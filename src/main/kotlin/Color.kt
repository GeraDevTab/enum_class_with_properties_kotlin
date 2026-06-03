enum class Color(
    val r: Int,
    val g: Int,
    val b: Int
) {
    RED(255,0,0),
    ORANGE(255, 165, 0),
    YELLOW(255, 255, 0),
    GREEN(0, 255, 0),
    BLUE(0, 0, 255),
    INDIGO(75, 0, 130),
    VIOLET(238, 130, 238);

    val rgb = (r * 256 + g) * 256 + b

    fun printColor() = println("$this is $rgb")
}

fun main() {
    println(Color.BLUE.rgb)
    //255
    Color.GREEN.printColor()

    println(getMnemonic(Color.BLUE))

    println(getWarmthFromSensor())
}

fun getMnemonic(color: Color) =
    when (color) {
        Color.RED -> "Richard"
        Color.ORANGE -> "Of"
        Color.YELLOW -> "York"
        Color.GREEN -> "Gave"
        Color.BLUE -> "1,0"
        Color.INDIGO -> "In"
        Color.VIOLET -> "Vain"
    }

fun measureColor() = Color.ORANGE
//as a stand in for more complex measurement logic

fun getWarmthFromSensor(): String {
    val color = measureColor()
    return when(color) {
        Color.RED, Color.ORANGE, Color.YELLOW -> "warm (red = ${color.r})"
        Color.GREEN -> "neutral (green = ${color.g})"
        Color.BLUE, Color.INDIGO, Color.VIOLET -> "cold (blue = ${color.b})"
    }
}
