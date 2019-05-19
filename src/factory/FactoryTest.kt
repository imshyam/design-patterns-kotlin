package factory

import factory.implementation.ShapeFactory

fun main() {
    val shapeFactory = ShapeFactory()
    val shape1 = shapeFactory.getShape("circle")
    shape1.draw()
    val shape2 = shapeFactory.getShape("rectangle")
    shape2.draw()
    val shape3 = shapeFactory.getShape("square")
    shape3.draw()
    val shape4 = shapeFactory.getShape("sfkfds")
    shape4.draw()
}