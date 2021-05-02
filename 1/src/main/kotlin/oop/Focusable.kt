package oop

interface Focusable {

    fun setFocus()

    // метод по умолчанию
    fun getInterfaceName() : String {
        return "Focusable"
    }

}