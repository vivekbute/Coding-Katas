package org.example.rohan

class MaximumRemovableCharacters {
    fun maximumRemovals(s: String, p: String, removable: IntArray): Int {
        var k = 0
        val modifiedInputString = s.toCharArray()
            for(eachVal in removable.indices){
                modifiedInputString[removable[eachVal]] = ' '
            if(isSubsequence(modifiedInputString.filter{ it != ' '}.joinToString(""),p)){
                k++
            } else {
                break
            }
        }
        return k
    }


    fun isSubsequence(s: String, p: String):Boolean {
//        println("******* ${s} ${p}")
//        println(s::class.java.typeName)
        var isStillSubsequence: Boolean
        var i = 0
//        val firstChar = p[i]
//        val indexOfFirstCharOfPinS = s.indexOf(firstChar)
        for(eachChar in s) {
            if(i < p.length && eachChar == p[i]){
                i++
            }
        }
        isStillSubsequence = i == p.length
        return isStillSubsequence
    }
}
