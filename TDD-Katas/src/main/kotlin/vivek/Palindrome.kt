package vivek

class Palindrome {
    fun isPalindrome(number: Int): Boolean {
        var originalNumber = number
        // 12
        // 12 % 10 = 2
        // 12 / 10 = 1.2 -> floor -> 1
        // 2 * 10
        // 1 * 1
        // 20 + 1 = 21

        // 157
        // 157 % 10 = 7 * 10 = 70
        // 157 / 10 = 15.7 -> floor -> 15
        // 15 % 10 = 5 = 70 + 5 = 75 * 10 = 750
        // 15 / 10 = 1.5 -> floor -> 1 = 750 + 1 = 751

        var reverseNumber = 0
        while (originalNumber > 0) {
            val remainder = originalNumber % 10
            reverseNumber = (reverseNumber * 10) + remainder
            originalNumber = originalNumber / 10
        }
        if (reverseNumber.equals(number)) {
            return true
        } else {
            return false
        }
    }

}
