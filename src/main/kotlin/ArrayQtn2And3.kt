/**
 *2.Assuming a group A contains elements (a,b,c,d,e,a,g,r,f) group B contains (ant,bee,elephant,dog,cat)
Create a map that links the two groups using their characters
 */
fun main() {
    var groupA = listOf("a", "b", "c", "d", "e", "a", "g", "r", "f")
    var groupB = listOf("ant", "bee", "elephant", "dog", "cat")

    var uniqueGroupA = groupA.toSet().toList()
    var sortedGroupB = groupB.sorted().toList()

    val linkedMap = mutableMapOf<String, String>()

    for (i in 0..uniqueGroupA.size) {
        if (i < sortedGroupB.size) {
            linkedMap[uniqueGroupA[i]] = sortedGroupB[i]
        }
//        else {
//            linkedMap[groupA[i]] = ""
//        }
    }

    println("First Linked Map:")
    linkedMap.forEach { (key, value) ->
        println("$key -> $value")
    }
    /**
     * 3.After implementing qtn 2, add five entries that map 5 unique characters to the respective animal name
     **/
    val newChars = listOf("u", "v", "w", "x", "y")
    for (i in 0..sortedGroupB.size) {
        if (i < newChars.size) {
            linkedMap[sortedGroupB[i]] = newChars[i]
        }
    }

    println("Second Linked Map:")
    linkedMap.forEach { (key, value) ->
        println("$key -> $value")
    }

}

