import kotlin.math.PI
import kotlin.math.pow

class Circle(_name: String) : Shape(_name) {

    // Initial Values
    private var radius: Double = 0.0
    private var area: Double = 0.0

    // Set Dimensions
    fun setDimensions(radius: Double) {
        this.radius = radius
        getArea()
    }

    // Print Dimensions
    override fun printDimensions() {
        println("Name: $name")
        println("Radius: $radius")
        println("Area: $area")
        println()
    }

    // Get Area
    override fun getArea(): Double {
        this.area = radius.pow(2.0) * PI
        return area
    }

}