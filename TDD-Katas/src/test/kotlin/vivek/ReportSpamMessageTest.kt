package vivek

import org.example.vivek.ReportSpamMessage
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class ReportSpamMessageTest {
    private val reportSpamMessage = ReportSpamMessage()

    @Test
    fun `Should return true if message contains at least two bannedWords`() {
        assertEquals(true, reportSpamMessage.reportSpam(arrayOf("hello","world","leetcode"), arrayOf("world","hello")))
    }

    @Test
    fun `Should return false if message contains only one bannedWords`() {
        assertEquals(false, reportSpamMessage.reportSpam(arrayOf("hello","programming","fun"), arrayOf("world","programming","leetcode")))
    }

    @Test
    fun `Should return false when message has only one bannedWords with one occurrence but duplicate in banned words`() {
        assertEquals(false, reportSpamMessage.reportSpam(arrayOf("s","a","aj","ps","h","ou","e","i","x"),
            arrayOf("j","a","b","fa","z","a","no","ih","nq")))
    }
}