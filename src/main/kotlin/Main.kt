fun main(args: Array<String>) {

    val customerList = listOf(Customer("Amy", 20), Customer("Brad", 33), Customer("Cathy", 44),
    Customer("Diego", 32), Customer("Elle", 41), Customer("Frances", 25),
        Customer("Gustavo", 28), Customer("Hendrick", 47), Customer("Ismail", 24),
    Customer("John", 37))

    customerOutput(customerList)

    val lis = listOf( listOf("Walmart", 102.32),
    listOf("Costco", 431.02),
    listOf("Kroger", 43.23),
    listOf("Macys", 321.32))
    println(lis.flatten())

    val liszip = listOf("Sam","Tim","Usher","Virgil")
    println(liszip.zipWithNext())

    val twenty = (0..19).toList()
    val firstList = twenty.filter{it % 2 == 0}
    val myList = List(10){(1 +it )* 13 }
    println(firstList)
    println(myList)

}

fun <Customer> customerOutput(vararg customers: Customer){
    for (c in customers){
        println( c.toString())

    }
}
private var counter =0
data class Customer(val name: String, val age: Int){
    private val uniqueID:String
    init {
        counter++
        uniqueID = "$counter"

    }

    override fun toString(): String {
        return "($name , $uniqueID)"
    }
}