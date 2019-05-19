package builder.implementation2

class Meal {
    private val items = mutableListOf<Item>()

    fun addItem(item: Item) {
        items.add(item)
    }

    fun getCost() = items.sumByDouble { it.price() }

    fun showItems() = items.forEach {
        println("${it.name()} is packed in ${it.packing().pack()}, Price: ${it.price()} ")
    }
}