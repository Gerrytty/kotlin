package exceptions

import java.io.BufferedReader
import java.io.ObjectInput
import java.io.StringReader
import java.lang.NumberFormatException

fun main() {
    println(isPercentage(11))
    // println(isPercentage(101))
    println(readNumber(BufferedReader(StringReader("123"))))
}

fun isPercentage(number: Int) : Int {
    return if (number in 1..100) number else throw IllegalArgumentException()
}

fun readNumber(reader: BufferedReader) : Int? {
    return try {
        Integer.parseInt(reader.readLine())
    }
    catch (e: NumberFormatException) {
        println("Not a number")
        null
    }
    finally {
        reader.close()
    }
}