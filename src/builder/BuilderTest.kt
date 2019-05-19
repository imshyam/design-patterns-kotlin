package builder

import builder.implementation.CarBuilder
import builder.implementation.CarBuilderImpl

class CarBuildDirector(private val carBuilder: CarBuilder) {
    fun construct() = carBuilder.setWheels(4).setColor("Red").build()
}

fun main() {
    val carBuilder = CarBuilderImpl()
    val carBuildDirector = CarBuildDirector(carBuilder)
    println(carBuildDirector.construct())
}