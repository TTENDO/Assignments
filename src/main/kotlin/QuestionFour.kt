import kotlin.math.sqrt
/** 4. Solve the equation x3+7x2+10x = 0 * **/
fun main(){
    //x3+7x2+10x = 0 => x(x2+7x+10) = 0
    val a = 1
    val b = 7
    val c = 10
    val(x1,x2) = solveQuadraticEquation(a.toFloat(),b.toFloat(),c.toFloat())
    println("x = $x1, x = $x2 and x = 0 ")
}

fun solveQuadraticEquation(a:Float,b:Float,c:Float):Pair<Float,Float>{
    var middle = b * b - 4 * a * c
    val sqrtOfMiddle = sqrt(middle.toFloat())
    val denominator = 2 * a
    val x1 = (-b + sqrtOfMiddle)/denominator
    val x2 = (-b - sqrtOfMiddle)/denominator
    return x1.toFloat() to x2.toFloat()
}