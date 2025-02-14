package vivek

import org.example.vivek.MaxNumberOfRemovableCharacters
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class MaxNumberOfRemovableCharactersTest {
    private val maxNumberOfRemovableCharacters =  MaxNumberOfRemovableCharacters();

    @Test
    fun `should return expected max Number Of Removable Characters`() {
        assertEquals(2, maxNumberOfRemovableCharacters.maximumRemovals("abcacb", "ab", intArrayOf(3,1,0)))
    }
}