package abstractfactory.implementation

class RoundedShapeFactory: AbstractFactory() {
    override fun getShape(shape: String): Shape {
        return when (shape) {
            "square" -> RoundedSquare()
            "rectangle" -> RoundedRectangle()
            else -> NoValidShape()
        }
    }

}