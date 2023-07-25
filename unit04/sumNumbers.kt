fun main() {

// loop to get the sum of all the integers from 1 up to the number entered by the user

    var input = 50
    var x = 0
    var sum = 0

    while (x <= input) {
        sum = sum + x
        println(sum)
        println("")
        x++
    }
// input validation for cases when user inputs negative integer

        var userInput: Int? = null
        while (userInput == null) {
            try {
                userInput = input?.toInt()
                if (userInput != null && userInput < 0) {
                    println("Invalid input. Please enter a positive integer.")
                    userInput = null
                }
            } catch (e: Exception) {
                println("Invalid input. Please enter a positive integer.")
            }
            break
        }
    }
