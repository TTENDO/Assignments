/**
 *2.Assuming a group A contains elements (a,b,c,d,e,a,g,r,f) group B contains (ant,bee,elephant,dog,cat)
Create a map that links the two groups using their characters
 */
fun main() {
    var groupA = listOf("a", "b", "c", "d", "e", "a", "g", "r", "f")
    var groupB = listOf("ant", "bee", "elephant", "dog", "cat")

    val charMap = mutableMapOf<Char, String?>()

    // map from group A
    groupA.forEach { element ->
        val firstChar = element.firstOrNull()
        if (firstChar != null) {
            charMap[firstChar] = element
        }
    }

    // map from group B
    groupB.forEach { element ->
        val firstChar = element.firstOrNull()
        if (firstChar != null) {
            if (charMap.containsKey(firstChar)) {
                charMap[firstChar] = "$element"
            }
        }
    }

    charMap.forEach { (t, u) ->
        if(u.toString().length < 2){
            charMap[t] = "no corresponding animal!"
        }
    }

    println("First map:")
    charMap.forEach { (char, elements) ->
        println("$char -> $elements")
    }

    /**
     * 3.After implementing qtn 2, add five entries that map 5 unique characters to the respective animal name
     **/
    val newChars = listOf('u', 'v', 'w', 'x', 'y')

    val combinedList = newChars.zip(groupB)

    charMap.putAll(combinedList)

    println("Second map:")
    charMap.forEach { (char, elements) ->
        println("$char -> $elements")
    }
}

