package abstractfactory.implementation

abstract class AbstractFactory {
    abstract fun getShape(shape: String): Shape
}