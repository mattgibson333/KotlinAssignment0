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
        this.halfP = side * 0.5
    }

    // Print Dimensions
    override fun printDimensions() {
        println("Side: $side")
    }

    // Get Area
    override fun getArea(): Double {
        return sqrt(halfP * ((halfP- side) * (halfP- side) * (halfP- side)))
    }

}