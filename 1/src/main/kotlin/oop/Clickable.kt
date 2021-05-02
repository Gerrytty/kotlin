package oop

interface Clickable {

    fun click()

    // метод по умолчанию
    fun getInterfaceName() : String {
        return "Clickable"
    }


}