/***
 * val is immutable
 * var is mutable
 ***/

fun main() {
    println("Hello World!")

    val firstNumber = 1
    val secondNumber = 2

    println("$firstNumber + $secondNumber = ${firstNumber + secondNumber}")

    // incorrect
    // firstNumber = 3

    var varNum = 1
    varNum = 3

    println("$varNum + $secondNumber = ${varNum + secondNumber}")

    val a: Int = 1
    val b: Int = 2

    println(a + b)

    add(a, b)

    // error
    // add(12.5, 1)

    val human = Human("Julia")
    printHumanName(human)

    val rectangle = Rectangle(10f, 20f)
    println(rectangle.isSquare)
    val square = Rectangle(10f, 10f)
    println(square.isSquare)

    println(Color.GREEN.rgb())
    println(getRussianColor(Color.GREEN))
    println(mix(Color.YELLOW, Color.RED))
    // println(mix(Color.RED, Color.INDIGO))
}

fun add(x: Int, y: Int): Int {
    val sum = x + y
    println("$x + $y = $sum")
    return sum
}

fun printHumanName(human: Human) {
    println(human.name)
}

fun getRussianColor(color: Color): String =
    when (color) {
        Color.GREEN -> "зеленый"
        Color.RED -> "красный"
        Color.YELLOW -> "желтый"
        Color.BLUE -> "синий"
        Color.INDIGO -> "индиго"
        Color.ORANGE -> "оранжевый"
        Color.VIOLET -> "фиолетовый"
    }

fun mix(c1: Color, c2: Color) =
    when (setOf(c1, c2)) {
        setOf(Color.RED, Color.YELLOW) -> Color.ORANGE
        setOf(Color.YELLOW, Color.BLUE) -> Color.YELLOW
        setOf(Color.BLUE, Color.VIOLET) -> Color.INDIGO
        else -> throw Exception("No pair colors")
    }
