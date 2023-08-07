/**
 *  3. A person has four option of choosing between; pizza, chicken, pancakes or cake.
 *  If they choose pizza, they'll go to pizza hut,if chicken, they'll go to kfc,
 *  if pancakes, they'll go to foodhub, if cake, they'll go to cakely.
 *     Write -a program using an if statement that captures the persons choice and prints the selected restaurant
 *     -same program using a when statement
 * **/
fun main(){
    println("Enter one of the following options\n1. When \n2. If")
    var conditionalMethod = readln()

    println("Enter one of the following options\n1. Pizza\n2. Chicken\n3. Pancakes\n4. Cake")

    var foodOption = readln()

    runConditionalStatement(foodOption,conditionalMethod)
}

fun runConditionalStatement(foodOption:String,whenStatement:String){
    when(whenStatement.lowercase().trim()){
        "when" -> when(foodOption.toString().lowercase().trim()){
            "pizza" -> println("Go to pizza hut")
            "chicken" -> println("Go to kfc")
            "pancakes" -> println("Go to foodhub")
            "cake" -> println("Go to cakely")
        }

        "if" ->   if(foodOption.toString().lowercase().trim() == "pizza"){
            println("Go to pizza hut")
        }
        else if(foodOption.toString().lowercase().trim() == "chicken"){
            println("Go to kfc")
        }
        else if(foodOption.toString().lowercase().trim() == "pancakes"){
            println("Go to foodhub")
        }
        else if(foodOption.toString().lowercase().trim() == "cake"){
            println("Go to cakely")
        }
    }
}