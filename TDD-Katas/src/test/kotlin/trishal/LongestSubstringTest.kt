package trishal

import org.example.trishal.LongestSubstring
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class LongestSubstringTest {
    private val longestSubstring = LongestSubstring()

    @Test
    fun `length should be equal to the size of the longest substring`() {
        assertEquals(3, longestSubstring.lengthOfLongestSubstring("apple"))
    }
}