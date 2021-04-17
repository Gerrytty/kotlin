class Rectangle(private val height: Float,
                private val width: Float) {
    val isSquare: Boolean
    get() {
        return height == width
    }
}