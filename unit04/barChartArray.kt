fun main(){

    println("Please enter today's sales for the 5 stores in the values below.")

    val store1Sales = 1000
    val store2Sales = 1200
    val store3Sales = 1800
    val store4Sales = 800
    val store5Sales = 1900

    println("Enter today's sales for store 1: $store1Sales")
    println("Enter today's sales for store 2: $store2Sales")
    println("Enter today's sales for store 3: $store3Sales")
    println("Enter today's sales for store 4: $store4Sales")
    println("Enter today's sales for store 5: $store5Sales")
    println("")
    println("SALES BAR CHART")


    val storeSales = intArrayOf(store1Sales, store2Sales, store3Sales, store4Sales, store5Sales)
        for (storeSale in storeSales) {

            var numberOfAsterisk = storeSale / 100
            val str = "*"
            val output = str.repeat(numberOfAsterisk)
            println(output)
        }
}
