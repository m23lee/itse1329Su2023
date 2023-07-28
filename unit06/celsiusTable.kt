import kotlin.math.absoluteValue
import kotlin.math.roundToInt

fun main(){
celsius()
}

fun celsius(){
    val fahrenheit = 100
    var celsius = (5.0/9.0)*(fahrenheit-32.0)
    var fahrenheightTable = 0

    println("$fahrenheit F is equivalenmt to $celsius C")
    println("")
    println("")

    println("FAHRENHEIGHT TABLE:")
    for (fahrenheightTable in 0..20){
        val str = "*"
        val fahrenheightTempTable = str.repeat(fahrenheightTable)
        println("fahrenheight: $fahrenheightTable")
        println(fahrenheightTempTable)
        var celsiusToFahrenheit = (5.0/9.0)*(fahrenheightTable-32.0)
        var celsiusTableConverter = (celsiusToFahrenheit).roundToInt().absoluteValue
        var celsiusTempTable =  str.repeat(celsiusTableConverter)
        println("Celsius: $celsiusToFahrenheit")
        println(celsiusTempTable)
    }


}
