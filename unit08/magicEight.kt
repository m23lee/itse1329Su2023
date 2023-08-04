fun main() {

    println("Ask a question to the ball at your own risk... (type in a question to receive an answer, type in 'quit' to end the session).")

    eightBallAnswer()
}

fun eightBallAnswer() {
    var userQuestion: String? = null
    while (userQuestion == null) {
        var userQuestion: String? = null
        val eightBall = arrayOf(
            "It is certain.",
            "Without a doubt.",
            "Concentrate and ask again.",
            "Cannot predict now.",
            "Outlook not so good.",
            "Very doubtful.",
            "Don't count on it.",
            "Signs point to yes."
        )

        var randomAnswer = eightBall.random()
        val input = readLine()
        try {
            userQuestion = input?.toString()

            if (userQuestion != null && userQuestion != "quit") {
                println(randomAnswer)
                println("")
                println("Ask a question if your heart desires it. (or type in 'quit' if you are finished.)")
            } else if (userQuestion != null && userQuestion == "quit"){
                println("Ending session. Goodbye")
                break
            }
        } catch (e: Exception) {
            println("please ask a question.")
        }
    }
}
