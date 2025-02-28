package vivek

import org.example.vivek.EncodeAndDecodeTinyUrl
import kotlin.test.Test

class EncodeAndDecodeTinyUrlTest {
    private val encodeDecodeTinyUrl = EncodeAndDecodeTinyUrl()

    @Test
    fun `Should return encoded string for given url`() {
        val url = "https://leetcode.com/problems/design-tinyurl";
        val commonPrefixString = encodeDecodeTinyUrl.encode(url)
        kotlin.test.assertEquals(commonPrefixString, "abcd0")
        val string = "abcd0";
        kotlin.test.assertEquals(encodeDecodeTinyUrl.decode(string), "https://leetcode.com/problems/design-tinyurl")
    }
}