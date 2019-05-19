package builder.implementation2

abstract class ColdDrink: Item{
    override fun packing() = Bottle()
    abstract override fun price(): Double
}