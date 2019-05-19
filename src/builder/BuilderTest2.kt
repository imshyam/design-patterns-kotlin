package builder

import builder.implementation2.MealBuilder

fun main() {
    val mealBuilder = MealBuilder()
    val vegMeal = mealBuilder.prepareVegMeal()
    println("Veg Meal: ")
    vegMeal.showItems()
    println("Total Price: ${vegMeal.getCost()}")
    val chickenMeal = mealBuilder.prepareChickenMeal()
    println("\n\n\nChicken Meal: ")
    chickenMeal.showItems()
    println("Total Price: ${chickenMeal.getCost()}")
}