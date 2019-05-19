package builder.implementation2

class MealBuilder {
    fun prepareVegMeal() = Meal().apply {
        addItem(VegBurger())
        addItem(Coke())
    }

    fun prepareChickenMeal() = Meal().apply {
        addItem(ChickenBurger())
        addItem(Pepsi())
    }
}