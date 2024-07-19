package trishal

import org.example.trishal.LongestSubstring
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class LongestSubstringTest {
    private val longestSubstring = LongestSubstring()

    @Test
    fun `length of the given string should be greater than zero`() {
        assertEquals(3, longestSubstring.lengthOfLongestSubstring("apple"))
    }
}