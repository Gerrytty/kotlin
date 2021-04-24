package functions

import Human

fun main() {
    println("Kotlin".lastChar())
    println(Human("Julia").getName())
}

fun String.lastChar() : Char = this.get(this.length - 1)

fun Human.getName() : String = "${this.name}!"