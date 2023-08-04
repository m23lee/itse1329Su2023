fun main() {

    val numberList = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val randomNumber = numberList.random()
    var userInput: Int? = null
    var count = 1

    println("Type in a number between 1 - 10 and then click enter.")

    while (userInput == null) {
        val input = readLine()
        try {
            userInput = input?.toInt()
            if (userInput != null && userInput < randomNumber) {
                println("Too low. Please try again.")
                userInput = null
                count +=1
            } else if (userInput != null && userInput > randomNumber) {
                println("Too high. Please try again.")
                userInput = null
                count +=1
            } else {
                println("You guessed the number correctly: $randomNumber! It took $count tries in order to guess the correct number.")

            }
        } catch (e: Exception) {
            println("Incorrect number submitted.")
        }
    }
}
