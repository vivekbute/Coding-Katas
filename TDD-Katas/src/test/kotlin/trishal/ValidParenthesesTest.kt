package trishal

import org.example.trishal.ValidParentheses
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ValidParenthesesTest {
    private val validParenthesesTest = ValidParentheses()

    @Test
    fun `should return true if the input string is valid`() {
        assertEquals(true, validParenthesesTest.isValid("[]()"))
        assertEquals(true, validParenthesesTest.isValid("[]"))
        assertEquals(true, validParenthesesTest.isValid("()"))
        assertEquals(true, validParenthesesTest.isValid("()[]{}"))
    }

    @Test
    fun `should return false if the input string is not valid`() {
        assertEquals(false, validParenthesesTest.isValid("[()"))
        assertEquals(false, validParenthesesTest.isValid("[)"))
    }
}