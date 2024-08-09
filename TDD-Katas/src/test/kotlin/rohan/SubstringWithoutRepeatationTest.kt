package rohan

import org.example.rohan.SubstringWithoutRepeat
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SubstringWithoutRepeatTest {
    private val subString = SubstringWithoutRepeat()

    @Test
    fun `returns 3 for apple as longest substring is ple`() {
        assertEquals(3, subString.lengthOfLongestSubstring("apple"))
    }
}
