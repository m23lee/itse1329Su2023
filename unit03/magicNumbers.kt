fun main() {

    println("Please enter a month (in numeric form), a day, and a two-digit year.")

    val month = 6
    val day = 10
    val year = 60

    //prompt user to input correct values if incorrect values were chosen
    when (month) {
        in 1..12 -> println("Valid month has been entered.")
        else -> println("Error: Invalid month: '$month' (not between 1-12) has been entered.")
    }
    when (day) {
        in 1..31 -> println("Valid day has been entered.")
        else -> println("Error: Invalid day: '$day' (not between 1-31) has been entered.")
    }
    when (year) {
        in 0..99 -> println("Valid year has been entered.")
        else -> println("Error: Invalid year: '$year' (not between 00 and 99) has been entered.")
    }

    //determine if month, day, and year combination is magic date or not
    if (year == month * day) {
    println("This is a magic date!")
    } else {
     println("This is not a magic date :(")
    }

}
