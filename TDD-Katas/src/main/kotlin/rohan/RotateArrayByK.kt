package org.example.rohan

class RotateArrayByK {
    fun rotateArray(nums: IntArray, k: Int): IntArray {
        val n = nums.size
        val loopCount = k % n
        if (loopCount == 0) return nums
        for (i in 0 until loopCount) {
            val temp = nums[n - 1]
            for (j in n - 1 downTo 1) {
                nums[j] = nums[j - 1]
            }
            nums[0] = temp
        }
        println(nums.toList())
        return nums
    }
}
