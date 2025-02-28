package shubham

import org.example.shubham.EncodeDecodeTinyUrl
import kotlin.test.Test
import kotlin.test.assertEquals

class EncodeDecodeTinyUrlTest {
    private val encodeDecodeTinyUrl = EncodeDecodeTinyUrl()

    @Test
    fun `Should return encoded string for given url`() {
        val url = "https://leetcode.com/problems/design-tinyurl";
        val commonPrefixString = encodeDecodeTinyUrl.encode(url)
        assertEquals(commonPrefixString, "abcd0")
        val string = "abcd0";
        assertEquals(encodeDecodeTinyUrl.decode(string), "https://leetcode.com/problems/design-tinyurl")
    }
}