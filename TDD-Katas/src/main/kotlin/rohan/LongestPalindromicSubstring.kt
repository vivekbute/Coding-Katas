package org.example.rohan

class LongestPalindromicSubstring {
    fun longestPalindrome(s: String): String {
        var skipLength = 0
        var substring = ""
        if(s.length == 1 || isPalindrome(s)){
            return s
        }
        while (skipLength < s.length) {
            val currentLength = s.length - skipLength
            for (i in 0..skipLength+1) {
                substring = s.substring(i, (currentLength - 1 + i))
                val res = isPalindrome(substring);
                if(res){
                    return substring
                }
            }
            skipLength += 1
        }
        return substring
    }

    private fun isPalindrome(string: String): Boolean {
        return string.reversed() == string
    }
}


fun main() {
    val result = LongestPalindromicSubstring().longestPalindrome("babad")
    println("*****result****** $result")
}

//babadad
//(babadad) // 7
//(babada, abadad) //6
//(babad, abada, badad) //5
//(baba, abad,bada,adad) // 4
//(bab, aba, bad,ada,dad) // 3
