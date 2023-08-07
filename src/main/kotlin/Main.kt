/** Write a function that has three parameters ie 2 doubles and a character
 * (*+-/) if * multiply, + add, - subtract, / divide **/
fun main() {
    println("Enter first double number");
    val a = readln()
    println("Enter second double number");
    val b = readln()
    println("Enter one of these characters + * / -");
    val c = readln()
    val result = calculateWhatsProvided(a.toDouble(),b.toDouble(),c.trim().single())
    println("The result of $a $c $b is $result")
}
fun calculateWhatsProvided(a:Double,b:Double,c:Char):Double{
    var enteredChar = c.toString()
    var result : Double =  0.0

    if(enteredChar == "-"){
        result = a-b
    } else if(enteredChar == "+"){
        result = a+b
    }
    else if(enteredChar == "*"){
        result = a*b
    }
    else if(enteredChar == "/"){
        result = a/b
    }
    return result
}