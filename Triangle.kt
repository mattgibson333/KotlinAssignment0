open class Triangle(_name: String) : Shape(_name) {

    // Initial Values
    private var side1: Double = 0.0
    private var side2: Double = 0.0
    private var side3: Double = 0.0
    private var area: Double = 0.0

    // Set Dimensions
    fun setDimensions(side1: Double, side2: Double, side3: Double) {
        this.side1 = side1
        this.side2 = side2
        this.side3 = side3
    }

    // Print Dimensions
    override fun printDimensions() {

    }

    // Get Area
    override fun getArea(): Double {
        return 0.0
    }

}