package shubham

import org.example.shubham.LongestPrefixInStringsArray
import kotlin.test.Test
import kotlin.test.assertEquals

class LongestPrefixInStringsArrayTest {
    private val longestPrefixStringsArray = LongestPrefixInStringsArray()

    @Test
    fun `Should return empty common prefix string if no common prefix match found`() {
        val strings:Array<String> = arrayOf("dog","racecar","car")
        val commonPrefixString = longestPrefixStringsArray.longestCommonPrefix(strings)
        assertEquals(commonPrefixString, "")
    }

    @Test
    fun `Should return common prefix string if common prefix match found`() {
        val strings:Array<String> = arrayOf("flower","flow","flight")
        val commonPrefixString = longestPrefixStringsArray.longestCommonPrefix(strings)
        assertEquals(commonPrefixString, "fl")
    }
}