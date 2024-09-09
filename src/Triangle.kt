import kotlin.math.sqrt

open class Triangle(_name: String) : Shape(_name) {

    // Initial Values
    private var side1: Double = 0.0
    private var side2: Double = 0.0
    private var side3: Double = 0.0
    private var perimiter: Double = 0.0
    private var halfP: Double = 0.0
    private var area: Double = 0.0

    // Set Dimensions
    fun setDimensions(side1: Double, side2: Double, side3: Double) {
        this.side1 = side1
        this.side2 = side2
        this.side3 = side3
        this.perimiter = side1 + side2 + side3
        this.halfP = perimiter * 0.5
        getArea()
    }

    // Print Dimensions
    override fun printDimensions() {
        println("Name: $name")
        println("Side 1: $side1 Side 2: $side2 Side 3: $side3")
        println("Area: $area")
        println()
    }

    // Get Area
    override fun getArea(): Double {
        this.area = sqrt(halfP * ((halfP - side1) * (halfP - side2) * (halfP - side3)))
        return area
    }

}