fun main() {

    val shape1: Shape = Square("Square")
    val shape2: Shape = Circle("Circle")
    val shape3: Shape = Triangle("Triangle")
    val shape4: Shape = EquilateralTriangle("Equilateral Triangle")

    print("Enter the length of a side for a square: ")
    var stringInput = readln()
    var squareSide: Double = stringInput.toDouble()
    println()
    if (shape1 is Square) {
        shape1.setDimensions(squareSide,squareSide)
    }

    print("Enter the radius of a circle: ")
    stringInput = readln()
    var circleRadius: Double = stringInput.toDouble()
    println()
    if (shape2 is Circle) {
        shape2.setDimensions(circleRadius)
    }

    print("Enter the length of side 1 on a triangle: ")
    stringInput = readln()
    var s1: Double = stringInput.toDouble()
    print("Enter the length of side 2 on a triangle: ")
    stringInput = readln()
    var s2: Double = stringInput.toDouble()
    print("Enter the length of side 3 on a triangle: ")
    stringInput = readln()
    println()
    var s3: Double = stringInput.toDouble()
    if (shape3 is Triangle) {
        shape3.setDimensions(s1, s2, s3)
    }

    print("Enter the side length of an equilateral triangle: ")
    stringInput = readln()
    var sideLength: Double = stringInput.toDouble()
    println()
    if (shape4 is EquilateralTriangle) {
        shape4.setDimensions(sideLength)
    }

    shape1.printDimensions()
    shape2.printDimensions()
    shape3.printDimensions()
    shape4.printDimensions()
}