package builder.implementation2

abstract class Burger: Item {
    override fun packing() = Wrapper()
    abstract override fun price(): Double
}