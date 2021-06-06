package demo

// точка входа в программу
fun main() {

    // неизменяемая переменная
    val a = 5
    // a += 5
    // такое не скомпилируется

    // изменяемая переменная
    var b = 10

    // всё впорядке
    b += 5

    println("$a + $b = ${a + b}")

    // такое тоже не скомпилируется
    // b = null

    // нужно специально указать что переменная млжет принимать значение null
    var c: Int? = null

    // loop

    val items = listOf("apple", "banana", "kiwifruit")
    for ((i, item) in items.withIndex()) {
        println("$i - $item")
    }

    // functionality

    val list = listOf<Int>(1, 2, 3, 4, -1, -2, -3, -4)

    val positives = list.filter { it > 0 }

    println(positives)

    val mulResult = calculate(4, 5) { x1, x2 -> x1 * x2 }

    println(mulResult)

}

// функции

fun sum(a: Int, b: Int): Int {
    return a + b
}

fun sum2(a: Int, b: Int) = a + b

fun calculate(x: Int, y: Int, operation: (Int, Int) -> Int): Int {
    return operation(x, y)
}