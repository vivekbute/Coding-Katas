import org.example.Palindrome
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class PalindromeTest{
    private val palindrome = Palindrome()

    @Test
    fun `check if the given integer is palindrome or not` () {
        assertEquals(true, palindrome.isPalindrome(151))
        assertEquals(false, palindrome.isPalindrome(-121))
        assertEquals(true, palindrome.isPalindrome(0))
    }
}