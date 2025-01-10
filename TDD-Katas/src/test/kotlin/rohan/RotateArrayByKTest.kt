package rohan

import org.example.rohan.ReportSpamMessage
import org.example.rohan.RotateArrayByK
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class RotateArrayByKTest{
    private val rotateArrayByKTest = RotateArrayByK()


    @Test
    fun `test single digit palindrome`() {
        var expectedArray = intArrayOf(5,6,7,1,2,3,4)
        var result = rotateArrayByKTest.rotateArray(intArrayOf(1,2,3,4,5,6,7), 3)
        assertEquals(expectedArray.toList(), result.toList())
    }
}
