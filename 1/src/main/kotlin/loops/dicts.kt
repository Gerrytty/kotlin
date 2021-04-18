package loops

import java.util.*

fun main() {
    val myDict = TreeMap<Char, Byte>()

    for (c in 'A'..'Z') {
        myDict[c] = c.toByte()
    }

    println(myDict)

    for ((letter, byte) in myDict) {
        println("$letter is $byte")
    }

    val myList = listOf<String>("a", "b", "c")

    for ((index, letter) in myList.withIndex()) {
        println("$letter is $index")
    }

}

fun isLetter(c: Char) {
    c in 'a'..'z' || c in 'A'..'Z'
}
