package abstractfactory.implementation

class ShapeFactory: AbstractFactory() {
    override fun getShape(shape: String): Shape {
        return when (shape) {
            "square" -> Square()
            "rectangle" -> Rectangle()
            else -> NoValidShape()
        }
    }
}