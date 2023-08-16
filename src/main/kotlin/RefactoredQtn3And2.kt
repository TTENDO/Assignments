fun main(){
    val groupA = listOf("a","b","c","d","e","a","g","r","f")
    val groupB = listOf("ant","bee","elephant","dog","cat")

    val map = mutableMapOf<String,String>()

    for(i in groupA){
        for(j in groupB){

            if(i.first() == j.first()){
                map.put(i,j)
            }
        }
    }

    map.forEach {
        println(it)
    }
}