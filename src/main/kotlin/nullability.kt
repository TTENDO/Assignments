fun main(){
    //nullability = a variable that can store a value but can still exist without one
//    println("Enter first value from the keyboard");
    //capture input from the keyboard
    /*
    readln() => returns a String
    readLine() and  readlnOrNull() => returns String?
    * */
//    val d = readln().toInt()
//    println("Enter second value from the keyboard");
//    val e = readln().toInt()
//
//    val sum = d+e
//    println(sum)


    //declaring a null variable
    val firstNo:Int ?= null

    //getting the length
    println("Enter something")
    var firstNumber:String ?= null
    firstNumber = readLine()
    print(firstNumber)
    //safe call - ?
    print(firstNumber?.length)
    //non null asserted call requires a variable not to be null
    //!!
    print(firstNumber!!.length)

}