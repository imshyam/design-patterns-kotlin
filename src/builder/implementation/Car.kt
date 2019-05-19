package builder.implementation

/**
 * Product Created by builder
 */
data class Car (var wheels: Int? = null, var color: String? = null) {
    override fun toString(): String = "Car has $wheels wheels and color is: $color"
}