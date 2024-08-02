package org.example.rohan

class SubstringWithoutRepeat {
    fun lengthOfLongestSubstring(s: String): Int {
        var longestLength = 0
        var start = 0
        for (i in s.indices) {
            for (j in start until i) {
                if (s[i] == s[j]) {
                    start = maxOf(start, j + 1)
                    break
                }
            }
            longestLength = maxOf(longestLength, i - start + 1)
        }
        return longestLength
    }
}

fun main(args: Array<String>) {
    val s = "Hello"
    println(SubstringWithoutRepeat().lengthOfLongestSubstring(s))
}


