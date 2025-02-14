package rohan

import org.example.rohan.MaximumRemovableCharacters
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class MaximumRemovableCharactersTest {
    private val maxRemovableChar = MaximumRemovableCharacters()
    @Test
    fun test() {
        assertEquals(2, maxRemovableChar.maximumRemovals("abcacb", "ab", intArrayOf(3,1,0)))
    }


    @Test
    fun `if p is substring of s`(){
        assertEquals(true, maxRemovableChar.isSubsequence("abcacb", "ab"))
        assertEquals(true, maxRemovableChar.isSubsequence("abcbddddd", "abcd"))
        assertEquals(false, maxRemovableChar.isSubsequence("adddddddd", "abcd"))
    }
}
