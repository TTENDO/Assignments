import kotlin.math.sqrt
/**
 *     2. A car is moving at a speed of 1000m/s at an acceleration of 25m/s/s
 *     Find the time it will take to move a distance of 5km
 *     Hint - acceleration = speed/time
 *     speed = distance/time
 *
 *     ax2 + bx + c = 0  x= -b +- sqrt((b2-4ac)/2a)
 *
 *     speed = initialSpeed + acceleration * time ----1
 *     speed = 1000 + 25 * t
 *
 *     speed = distance / time -----2
 *     1000 + 25t = (5*1000)/t
 *     25t2 + 1000t - 5000 = 0
 *
 *
 * ***/
fun main(){
    val a = 25
    val b = 1000
    val c = -(5*1000)

    var middle = b * b - 4 * a * c
    val sqrtOfMiddle = sqrt(middle.toFloat())
    val denominator = 2 * a
    val x1 = (-b + sqrtOfMiddle)/denominator
    val x2 = (-b - sqrtOfMiddle)/denominator

    if(x1 > 0){
        println("It will take $x1 seconds to travel 5km")
    }
    else if(x2 > 0){
        println("It will take $x2 seconds to travel 5km")
    }
}



