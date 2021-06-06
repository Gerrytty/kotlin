package oop

class Button : Clickable, Focusable {

    /***
     * Переопределяемые методы из интерфейсов
     * должны быть помечены override
     ***/

    override fun click() {
        println("Button was clicked")
    }

    override fun setFocus() {
        println("Focus set")
    }

    // вызываем методы по умолчанию из интерфецсов
    override fun getInterfaceName(): String {
        return "This class used ${super<Clickable>.getInterfaceName()} and ${super<Focusable>.getInterfaceName()} interfaces"
    }


}