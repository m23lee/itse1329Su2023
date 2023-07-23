fun main() {
    println("Please input a number within the inclusive ranges of 1 through 10.")

    val number = 10

    if (number > 0 && number < 2) {
        println("I")
    } else if (number > 1 && number < 3) {
        println("II")
    } else if (number > 2 && number < 4) {
        println("III")
    } else if (number > 3 && number < 5) {
        println("IV")
    } else if (number > 4 && number < 6) {
        println("V")
    } else if (number > 5 && number < 7) {
        println("VI")
    } else if (number > 6 && number < 8) {
        println("VII")
    } else if (number > 7 && number < 9) {
        println("VIII")
    } else if (number > 8 && number < 10) {
        println("IX")
    } else if (number > 9 && number < 11) {
        println("X")
    } else if (number < 1) {
        println("Error. The number inputted is not within the inclusive range of 1-10")
    } else if (number > 10) {
        println("Error. The number inputted is not within the inclusive range of 1-10")
    }

}
