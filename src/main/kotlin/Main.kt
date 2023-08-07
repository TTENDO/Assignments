
fun main() {
    //ARRAYS
    //Non primitive array
    val firstArray = arrayOf("Kenya","Uganda",8,true)

    //primitive array
    val s = Array<Int>(5,{0})
    val secondArray = IntArray(5,{0})

    //assigning values in my array
    secondArray[0] = 9
    secondArray[1] = 10
    secondArray[2] = 9
    secondArray[3] = 9
    secondArray[4] = 9

    //loop through an array
    for(item in secondArray){
        println(item)
    }

    val k = Array<Char>(5,{'D'})
    //variations of loops ie for loop, //foreach loop
    k[0] = 't'
    for (i in k) {
        println(i)
    }

    k.forEach {
        print(it)
    }

    //for loop incrementing by 2

    for(i in 0 .. 10 step 2){
        print(i)
    }

    for(i in 10 downTo 0 ){
        println(i)
    }
}
