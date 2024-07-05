package org.example.rohan

class Palindrome {
    fun checkPalindrome(x: Int): Boolean {
        var originalNumber = x
        if (originalNumber < 0) {
            return false
        }

        val original = originalNumber
        var reversed = 0
        while (originalNumber != 0) {
            reversed = reversed * 10 + originalNumber % 10
            originalNumber /= 10
        }
        return original == reversed
    }
}
