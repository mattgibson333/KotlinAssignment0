import kotlin.math.sqrt

class EquilateralTriangle(_name: String) : Triangle(_name) {

    // Initial Values
    private var side: Double = 0.0
    private var perimiter: Double = 0.0
    private var halfP: Double = 0.0
    private var area: Double = 0.0

    // Set Dimensions
    fun setDimensions(side: Double) {
        this.side = side
        this.perimiter = side * 3
        this.halfP = perimiter * 0.5
        getArea()
    }

    // Print Dimensions
    override fun printDimensions() {
        println("Name: $name")
        println("Side: $side")
        println("Area: $area")
        println()
    }

    // Get Area
    override fun getArea(): Double {
        this.area = sqrt(halfP * ((halfP- side) * (halfP- side) * (halfP- side)))
        return area
    }

}