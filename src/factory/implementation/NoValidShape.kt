package factory.implementation

class NoValidShape: Shape {
    override fun draw() {
        println("Not a valid shape.")
    }
}