open class Shape(val length: Double, val width: Double) {
    open fun getArea(): Double {
        return length * width
    }
}

class Rectangle(length: Double, width: Double) : Shape(length, width)
class Square(length: Double) : Shape(length, length)
