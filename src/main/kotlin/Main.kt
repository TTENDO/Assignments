import kotlin.math.sqrt

fun main(args: Array<String>) {
    //Question One
    val currentYear = 2023;
    val yearOfBirth = 1998;
    var age = currentYear - yearOfBirth;
    println("My age is $age.");

    //Question two
    var base : Double = 4.0;
    var height : Double = 3.0;

    var hypotenuse: Double = sqrt(base * base + height * height);

    println("The hypotenuse is = "+hypotenuse +"cm.");
}