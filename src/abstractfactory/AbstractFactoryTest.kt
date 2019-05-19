package abstractfactory

import abstractfactory.implementation.FactoryProducer

fun main() {
    val factoryProducer1 = FactoryProducer.getFactory(true)
    val shape1 = factoryProducer1.getShape("rectangle")
    shape1.draw()
    val shape2 = factoryProducer1.getShape("square")
    shape2.draw()
    val factoryProducer2 = FactoryProducer.getFactory(false)
    val shape3 = factoryProducer2.getShape("rectangle")
    shape3.draw()
    val shape4 = factoryProducer2.getShape("square")
    shape4.draw()
    val shape5 = factoryProducer2.getShape("circle")
    shape5.draw()
}