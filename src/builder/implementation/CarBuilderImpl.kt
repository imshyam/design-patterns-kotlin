package builder.implementation

class CarBuilderImpl : CarBuilder {

    private var tmpCar = Car()

    override fun build() = Car(tmpCar.wheels, tmpCar.color)

    override fun setColor(color: String): CarBuilder {
        tmpCar.color = color
        return this
    }

    override fun setWheels(wheels: Int): CarBuilder {
        tmpCar.wheels = wheels
        return this
    }

}