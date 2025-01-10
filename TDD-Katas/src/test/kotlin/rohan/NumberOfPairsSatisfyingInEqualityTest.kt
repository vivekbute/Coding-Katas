package rohan

import org.example.rohan.NumberOfPairsSatisfyingInEquality
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class NumberOfPairsSatisfyingInEqualityTest {

    private val numberOfPairsSatisfyingInequality = NumberOfPairsSatisfyingInEquality()

    @Test
    fun `returns 3 as there are 3 pairs that satisfy the conditions`() {
        val result = numberOfPairsSatisfyingInequality.numberOfPairs(intArrayOf(3,2,5), intArrayOf(2,2,1), 1)
        assertEquals(3, result)
    }

    @Test
    fun `returns 0 as there are 0 pairs that satisfy the conditions`() {
        val result = numberOfPairsSatisfyingInequality.numberOfPairs(intArrayOf(3,-1), intArrayOf(-2,2), -1)
        assertEquals(0, result)
    }

}
