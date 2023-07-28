fun main() {
    isNumberDivisible()
    isPrime()

}
    fun isNumberDivisible() {

        println("Part 1: Determine if number is divisible by another- ")
        val number = 13
        var divisor = 2
        var numberDivisorMod = number % divisor
        var divisorBoolean: Boolean = false

        if (numberDivisorMod == 0) {
            var divisorBoolean: Boolean = true
            println("$divisorBoolean : Yes, $number is divisible by $divisor.")
        } else {
            var divisorBoolean: Boolean = false
            println("$divisorBoolean : No $number is NOT divisible by divisor number$divisor.")
        }
    }


    fun isPrime() {

        println("Part 2: Determine if this number is a prime number- ")
        val figure = 14
        var divisor = 2
        var numberPrimeBoolean: Boolean = true

        if (figure < 0) {
            println("$figure is NOT a input. Please input a positive integer for 'figure'.")
        }

        for (divisor in 2..<figure) {
            var divideNumber = figure / divisor
            var numberPrimeBoolean: Boolean = true

            if (figure % divisor == 0) {
                var numberPrimeBoolean = false
                println("$figure / $divisor = $divideNumber. $figure is a prime number: $numberPrimeBoolean")
            } else {
                println("$figure is not divisible by $divisor")
            }
        }
    }
