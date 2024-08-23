package rohan

import org.example.rohan.ValidParenthesis
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class ValidParenthesisTest{
    private val validParenthesis = ValidParenthesis()

    @Test
    fun `Test single bracket valid string`() {
        assertEquals(true, validParenthesis.isValid("()"))
    }

    @Test
    fun `Test multiple brackets valid string`() {
        assertEquals(true, validParenthesis.isValid("()[]{}"))
    }

    @Test
    fun `Test invalid brackets string`() {
        assertEquals(false, validParenthesis.isValid("(]"))
    }

    @Test
    fun `Test two brackets valid string`() {
        assertEquals(true, validParenthesis.isValid("{[]}"))
    }

    @Test
    fun `Test invalid length(odd) string`() {
        assertEquals(false, validParenthesis.isValid("{[]}(){"))
    }

    @Test
    fun `Test invalid string with only characters`() {
        assertEquals(false, validParenthesis.isValid("abcdefghijkl"))
    }
}
