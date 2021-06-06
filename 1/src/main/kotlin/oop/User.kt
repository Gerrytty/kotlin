package oop

/***
 * data class - автоматически гененрирует hashCode, equals, toString
 * используя все параметры конструктора
 ***/
data class User(private val username: String)

/***
 * object создает единственный экземпляр этого клааса
 ***/
object Singleton {
    fun printInfo() {
        println("Some info")
    }
}

interface UserInterface {
    val username: String
}

/***
 * реализуем свойсвтво интерфейса
 * переопределяем его в конструкторе
 ***/
class MyUser(override val username: String) : UserInterface

/***
 * var разрешает запись и чтение
 * val рарешает только чтение
 * приватные поля можно читать/изменять только в клаасе
 * для них нельзя написать геттеры и сеттеры
 ***/
class MyClass {
    var myField: String = ""
        get() {
            println("Custom get")
            return field
        }
        set(value) {
            println("Custom ser")
            field = "$value!"
        }
}

fun main() {
    println(User("gerrytty"))

    Singleton.printInfo()

    val myClass = MyClass()

    myClass.myField = "some field"

    println(myClass.myField)
}