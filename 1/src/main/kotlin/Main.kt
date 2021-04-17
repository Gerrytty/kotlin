/***
 * val is immutable
 * var is mutable
 */

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
}

fun add(x:Int, y:Int) : Int {
    val sum = x + y
    println("$x + $y = $sum")
    return sum
}

fun printHumanName(human: Human) {
    println(human.name)
}