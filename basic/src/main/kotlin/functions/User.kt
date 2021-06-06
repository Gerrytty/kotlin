package functions

class User(private val name: String, private val email: String) {

    fun save() {
        // вложенная функция
        fun validate(value: String, valueName: String) {
            if (value.isEmpty()) {
                throw IllegalArgumentException("$valueName is Empty")
            }
        }

        validate(this.name, "Name")
        validate(this.email, "Email")

        println("User saved")
    }

}

fun main() {
    val user = User("Julia", "julia@gmail.com")

    user.save()

    val user2 = User("Julia", "")

    user2.save()
}