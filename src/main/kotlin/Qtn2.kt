/**
 *  2.create an array of 6 doubles and print out the sum of all elements in the array
*/

fun main(){
    val theDouble = DoubleArray(6,{index -> index.toDouble()})

    var sumOfAll = theDouble.sum()
    var theArray = theDouble.joinToString(", ")

    println("The sum of $theArray is $sumOfAll")
}
