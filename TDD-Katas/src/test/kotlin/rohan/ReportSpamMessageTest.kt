package rohan
import org.example.rohan.ReportSpamMessage
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ReportSpamMessageTest{
    private val reportSpamMessage = ReportSpamMessage()

    @Test
    fun `returns false`() {
        assertEquals(true , reportSpamMessage.reportSpam(arrayOf("hello","world","leetcode"),  arrayOf("world","hello")))
    }

    @Test
    fun `returns true`() {
        assertEquals(false , reportSpamMessage.reportSpam(arrayOf("hello","programming","fun"), arrayOf("world","programming","leetcode")))
    }

    @Test
    fun `returns true when a single banned word appear twice in message`() {
        assertEquals(true , reportSpamMessage.reportSpam(arrayOf("l","i","l","i","l"), arrayOf("d","a","i","v","a")))
    }
    @Test
    fun `returns false when message has single baned word with one occurrence but duplicate in banned word`() {
        assertEquals(false  , reportSpamMessage.reportSpam(arrayOf("s","a","aj","ps","h","ou","e","i","x"), arrayOf("j","a","b","fa","z","a","no","ih","nq")))
    }
}
