package vivek

import org.example.vivek.ValidParentheses
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class ValidParenthesesTest {
    private val validParentheses = ValidParentheses()

    @Test
    fun `return true if given string is valid parentheses` () {
        assertEquals(true, validParentheses.isValid("()"))
        assertEquals(true, validParentheses.isValid("()[]{}"))
    }

    @Test
    fun `return false if given string is not valid parentheses` () {
        assertEquals(false, validParentheses.isValid("(]"))
    }
}