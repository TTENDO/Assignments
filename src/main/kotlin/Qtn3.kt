/**
//3.In a class, there are 5 students; Ivan, Aron, Grace, Nisah and Christine.
Create an array in this order and afterwards print the result of the elements in alphabetical order
 */
fun main(){
    val names = arrayOf("Ivan", "Aron", "Grace", "Nisah", "Christine")
    val sortedNames = names.sorted()

    println("\nNames in alphabetical order:\t ${sortedNames.joinToString(",")}")
}