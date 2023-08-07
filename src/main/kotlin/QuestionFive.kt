/**
 *     5. A person is moving to his village with a car moving at 20km/h and He has many
 *     alternative routes. * If he uses route1, he'll move a distance of 5000km *If he uses route2, he'll move a distance of 25000km *
 *     If he uses route3, he'll move a distance of 50000km *If he uses another, he'll move a distance of 10000km *
 *     Find the time it will take hin to reach the village using the separate routes
 *     -using an if statement   -using a when statement
 * **/
fun main(){
    println("Enter one of the following options\n1. When \n2. If")
    var conditionalMethod = readln()

    println("Enter one of the following routes\n1. Route1\n2. Route2\n3. Route3")

    var route = readln()
    var distance: Int
    var speed: Int = 20
    var howLong:Float

    when(conditionalMethod.lowercase().trim()){
        "when" ->  when(route.lowercase().trim()){
            "route1" ->  println("It's going to take you ${findTime(5000.toFloat(),speed.toFloat(),conditionalMethod)} hours to reach the village")
            "route2" ->  println("It's going to take you ${findTime(25000.toFloat(),speed.toFloat(),conditionalMethod)} hours to reach the village")
            "route3" ->  println("It's going to take you ${findTime(50000.toFloat(),speed.toFloat(),conditionalMethod)} hours to reach the village")
            else ->  println("It's going to take you ${findTime(10000.toFloat(),speed.toFloat(),conditionalMethod)} hours to reach the village")
        }

        "if" ->  if(route.toString().lowercase().trim() == "route1"){
            distance = 5000
            howLong = findTime(distance.toFloat(),speed.toFloat(),conditionalMethod)
            println("It's going to take you $howLong hours to reach the village")
        }
        else if(route.toString().lowercase().trim() == "route2"){
            distance = 25000
            howLong = findTime(distance.toFloat(),speed.toFloat(),conditionalMethod)
            println("It's going to take you $howLong hours to reach the village")
        }
        else if(route.toString().lowercase().trim() == "route3"){
            distance = 50000
            howLong = findTime(distance.toFloat(),speed.toFloat(),conditionalMethod)
            println("It's going to take you $howLong hours to reach the village")
        }
        else{
            distance = 10000
            howLong = findTime(distance.toFloat(),speed.toFloat(),conditionalMethod)
            println("It's going to take you $howLong hours to reach the village")
        }
    }
}

fun findTime(distance:Float,speed:Float,conditionalMethod: String):Float{
    val time = distance / speed
    return time
}