class Square(_name: String) : Shape(_name) {

    // Initial Values
    private var length: Double = 0.0
    private var height: Double = 0.0
    private var area: Double = length * height

    // Set Dimensions
    fun setDimensions(length: Double, height: Double) {
        this.length = length
        this.height = height
    }

    // Print Dimensions
    override fun printDimensions() {
        println("Length: $length Height: $height")
    }

    // Get Area
    override fun getArea(): Double {
        this.area = length * height
        return area
    }

}