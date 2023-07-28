fun main(){
    calculateRetail()
}

fun calculateRetail(){

    val wholesaleCost = 10.00
    val markupPercentage = 100.00
    var retailPrice = wholesaleCost + (wholesaleCost*(markupPercentage/100))

    println("$$retailPrice")
}
