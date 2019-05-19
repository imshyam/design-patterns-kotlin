package factory.implementation

class ShapeFactory {
    fun getShape(shape: String): Shape {
        return when (shape) {
            "circle" -> Circle()
            "square" -> Square()
            "rectangle" -> Rectangle()
            else -> NoValidShape()
        }
    }
}