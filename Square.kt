class Square(_name: String) : Shape(_name) {
    var length: Double = 0.0
    var height: Double = 0.0
    var area: Double = length * height
    fun setDimensions(length: Double, height: Double) {
        this.length = length;
        this.height = height;
    }
    override fun printDimensions() {
        println("Length: $length Height: $height")
    }

    override fun getArea(): Double {
        area = this.length * height
        return area
    }

}