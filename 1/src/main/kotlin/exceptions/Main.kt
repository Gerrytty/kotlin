package exceptions

fun main() {
    println(isPercentage(11))
    println(isPercentage(101))
}

fun isPercentage(number: Int) : Int {
    return if (number in 1..100) number else throw IllegalArgumentException()
}