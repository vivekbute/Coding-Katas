package rohan

import org.example.rohan.LongestPalindromicSubstring
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class LongestPalindromicSubstringTest{
    private val longestPalindromicSubstring = LongestPalindromicSubstring();

    @Test
    fun `test longest palindromic substring`() {
        assertEquals("bab", longestPalindromicSubstring.longestPalindrome("babad"))
    }

    @Test
    fun `test longest palindromic substring-1 `() {
        assertEquals("bb", longestPalindromicSubstring.longestPalindrome("cbbd"))
    }

    @Test
    fun `test longest palindromic substring-2 `() {
        assertEquals("a", longestPalindromicSubstring.longestPalindrome("a"))
    }

    @Test
    fun `test longest palindromic substring-3 `() {
        assertEquals("bb", longestPalindromicSubstring.longestPalindrome("bb"))
    }

    @Test
    fun `test longest palindromic substring-4 `() {
        assertEquals("bb", longestPalindromicSubstring.longestPalindrome("abb"))
    }

    @Test
    fun `test longest palindromic substring-5 `() {
        assertEquals("a", longestPalindromicSubstring.longestPalindrome("ac"))
    }
}
