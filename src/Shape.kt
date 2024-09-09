abstract class Shape (_name : String) : Dimensionable {
    // Each Shape has a name
    var name = _name
    // Each Shape needs its area calculated
    open fun getArea(): Double {
        return 0.0
    }

}