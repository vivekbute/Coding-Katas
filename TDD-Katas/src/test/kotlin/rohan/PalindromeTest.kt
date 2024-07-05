package rohan

import org.example.rohan.Palindrome
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class PalindromeTest {
    private val palindrome = Palindrome()

    @Test
    fun `test single digit palindrome`() {
        assertEquals(true, palindrome.checkPalindrome(1))
    }

    @Test
    fun `test positive palindrome numbers`() {
        assertEquals(true, palindrome.checkPalindrome(121))
        assertEquals(true, palindrome.checkPalindrome(1331))
    }

    @Test
    fun `test non-palindrome numbers`() {
        assertEquals(false, palindrome.checkPalindrome(123))
        assertEquals(false, palindrome.checkPalindrome(4193))
    }
}
