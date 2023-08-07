/***
 *1.Create an Array of 50 integers and use a forloop to print out the names of those integers
*/
fun main(args: Array<String>) {

    val anArray = IntArray(50,{index -> index})
    for (i in anArray) {
        println(i)
    }
}

