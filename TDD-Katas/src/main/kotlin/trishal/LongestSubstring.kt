package org.example.trishal

class LongestSubstring {
    fun lengthOfLongestSubstring(str: String): Int {
        var maxLength = 0

        for (i in str.indices){
            val currentChar = str[i]
            var currentString = currentChar.toString()
            for (j in i + 1 until str.length) {
                if (!currentString.contains(str[j])) {
                    currentString += str[j]
                }
                else break
            }
            maxLength = Math.max(currentString.length, maxLength)
        }
        return maxLength
    }
}