class Square(_name: String) : Shape(_name) {

    // Initial Values
    private var length: Double = 0.0
    private var height: Double = 0.0
    private var area: Double = 0.0

    // Set Dimensions
    fun setDimensions(length: Double, height: Double) {
        this.length = length
        this.height = height
        getArea()
    }

    // Print Dimensions
    override fun printDimensions() {
        println("Name: $name")
        println("Length: $length Height: $height")
        println("Area: $area")
        println()
    }

    // Get Area
    override fun getArea(): Double {
        this.area = length * height
        return area
    }

}