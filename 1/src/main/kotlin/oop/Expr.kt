package oop

/***
 * sealed class - разрешает наследоваться от него
 * только во внутренних классах
 ***/
sealed class Expr {

    fun func() {
        println("Function from parent superclass")
    }

    class Num(val num: Int) : Expr()
    class Sum(val left: Expr, val right: Expr) : Expr()

}

fun eval(e: Expr) : Int {
    return when(e) {
        is Expr.Num -> e.num
        is Expr.Sum -> eval(e.right) + eval(e.left)
    }
}

/***
 * По умолчанию все классы final (от них нельзя наследоваться)
 * Чтобы разрешить наследование нужно указать модификатор open
 ***/
open class Test(private val testName: String) {
    // с функиями тоже самое
    open fun makeTest() {
        println(testName)
    }
}

class MyTest: Test("my test") {
    /***
     * Когда переопределяем метод из суперкласса нужно обеязательно
     * указать модификатор override
     ***/
    override fun makeTest() {
        println("Awesome test")
    }
}

class Human constructor(name: String) {

    private val name: String

    init {
        this.name = name
    }

    fun printName() {
        println(name)
    }
}

/***
 * Класс с приватным конструктором
 * Нельзя создать экземпляр этого класса
 ***/
class Secretive private constructor() {
    fun getSecret() {
        println("It's secret")
    }
}


/***
 * Класс с двумя вторичными конструкторами
 ***/
class MyButton {

    private var color: String? = null
    private var x: Int = 0
    private var y: Int = 0

    constructor(color: String) {
        this.color = color
    }

    constructor(color: String, x: Int, y: Int) {
        this.color = color
        this.x = x
        this.y = y
    }

    fun printColor() {
        println(color)
    }

    fun printXY() {
        println("x pos = $x, y pos = $y")
    }
}

fun main() {
    val expr = Expr.Num(4)
    println(eval(expr))

    Test("Abstract test").makeTest()
    MyTest().makeTest()

    Human("Julia").printName()

    MyButton("Black").printColor()
    MyButton("Yellow", 1, 1).printXY()
}