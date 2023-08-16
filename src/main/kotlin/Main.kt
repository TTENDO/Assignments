/****
 *1.Create a class Color having attributes name, symbol and hex code
 * and a function that returns the three attributes as a string
*/
open class Color{
    var name: String = ""
    var symbol: String = ""
    var hexCode: String = ""

    open fun getColorInfo(): String {
        return "Name => $name, Symbol => $symbol, Hex Code => $hexCode"
    }
}
/***
 *2.Create a class Rainbow that inherits from Color
 * and modifies the function in class Color to return all the colors of a rainbow and prints the output
 */
class Rainbow : Color() {
    private val rainbowColors = listOf(
        Color().apply {
            name = "Red"
            symbol = name.first().toString().uppercase()
            hexCode = "#FF0000"
        },
        Color().apply {
            name = "Orange"
            symbol = name.first().toString().uppercase()
            hexCode = "#FFA500"
        },
        Color().apply {
            name = "Yellow"
            symbol = name.first().toString().uppercase()
            hexCode = "#FFFF00"
        },
        Color().apply {
            name = "Green"
            symbol = name.first().toString().uppercase()
            hexCode = "#008000"
        },
        Color().apply {
            name = "Blue"
            symbol = name.first().toString().uppercase()
            hexCode = "#0000FF"
        },
        Color().apply {
            name = "Indigo"
            symbol = name.first().toString().uppercase()
            hexCode = "#4B0082"
        },
        Color().apply {
            name = "Violet"
            symbol = name.first().toString().uppercase()
            hexCode = "#EE82EE"
        }
    )

    override fun getColorInfo(): String {
        val rainbowInfo = rainbowColors.joinToString("\n") { it.getColorInfo() }
        return rainbowInfo
    }
}

fun main() {
    val rainbow = Rainbow()
    val rainbowColorsInfo = rainbow.getColorInfo()
    println("Rainbow Colors:\n$rainbowColorsInfo")
}

