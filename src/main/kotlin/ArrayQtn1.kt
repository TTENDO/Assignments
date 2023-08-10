/**
 *  1.Create a list of 10 integers 89,45,23,5,67,12,55,89,54 and 55 and print them out in ascending order
*/
fun main(){
    val numbers = listOf(89, 45, 23, 5, 67, 12, 55, 89, 54, 55)
    val sortedNumbers = numbers.sorted()

    println("Sorted numbers in ascending order:")
    sortedNumbers.forEach {
        println(it)
    }
}
