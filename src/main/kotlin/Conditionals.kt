
fun main(){
    /**
     * conditionals => evaluates to true or false
    if, if else, when
     */
//    val rain = false
//    if(rain){
//        println("Ground is getting wet")
//    }
//    else{
//        println("Go to the beach")
//    }

//    println("Enter year of birth")
//    var year = readln()
//    if(year == "2000"){
//        print("You're a Gen Z!")
//    }
//    else if(year == "1989"){
//        print("You're a millennial")
//    }
//    else{
//        print("You're not a Gen Z!")
//    }

    /**
     * 1996-2015 -Gen Z
     * 1974-1995 -Millenial
     * 1960-1973 -Gen X
     * 0-1959 - Baby Boomer
     * **/
//      IF AND IF ELSE
//    println("Enter year of birth")
//    var year = readln().toInt()
//    if(year <= 1959){
//        print("You are a Baby Boomer!")
//    }
//    else if(year <= 1973){
//        print("You are a Gen X!")
//    }
//    else if(year <= 1995){
//        print("You are a Millennial!")
//    }
//    else if(year <= 2015){
//        print("You are a Gen Z!")
//    }
//    else{
//        print("You're a in the future!")
//    }

//    println("Enter year of birth")
//    var year = readln().toInt()
//    //year >=0 && year <= 1959
//    if(year in 0..1959){
//        print("You are a Baby Boomer!")
//    }
//    else if(year >= 1960 && year <= 1973){
//        print("You are a Gen X!")
//    }
//    else if(year >= 1974 && year <= 1995){
//        print("You are a Millennial!")
//    }
//    else if(year >= 1996 && year <= 2015){
//        print("You are a Gen Z!")
//    }
//    else{
//        print("You're a in the future!")
//    }

    //WHEN STATEMENT => SWITCH STATEMENT
    println("Enter year of birth")
    var year = readln().toInt()
    when(year){
        in 0..1959 -> println("You are a Baby Boomer!")
        in 1960..1973 -> println("You are a Gen X!")
        in 1974..1995 -> println("You are a Millennial!")
        in 1996..2015 -> println("You are a Gen Z!")
        else -> print("You're a in the future!")
    }

}