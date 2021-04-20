package collections

import java.lang.StringBuilder

fun main() {
    val map = mapOf<Int, String>(1 to "one", 2 to "two")
    println(map)

    val list = listOf<Int>(1, 2, 3, 4, 5)
    println(list.maxOrNull())
    println(list.lastOrNull())

    println(joinToString<Int>(listOf(1, 2, 3, 4, 5), "(", ")", ";"))
}

fun <T> joinToString(collection: Collection<T>,
                     prefix: String,
                     postfix: String, separator: String) : String {

    val stringBuilder = StringBuilder(prefix)

    for ((index, element) in collection.withIndex()) {
        if (index > 0) {
            stringBuilder.append(separator)
        }
        stringBuilder.append(element)
    }

    stringBuilder.append(postfix)

    return stringBuilder.toString()

}