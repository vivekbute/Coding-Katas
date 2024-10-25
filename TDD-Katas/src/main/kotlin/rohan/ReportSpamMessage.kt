package org.example.rohan

//    https://leetcode.com/problems/report-spam-message/

class ReportSpamMessage{
//    fun reportSpam(message: Array<String>, bannedWords: Array<String>): Boolean {
//        val bannedSet = bannedWords.toSet()
//        var count = 0
//
//        for (word in message) {
//            if (word in bannedSet && ++count >= 2) {
//                return true
//            }
//        }
//        return false
//    }

    fun reportSpam(message: Array<String>, bannedWords: Array<String>): Boolean {
        val bannedSet = bannedWords.toSet()
        var bannedCount = 0

        for (word in message) {
            if (word in bannedSet) {
                bannedCount++
                if (bannedCount >= 2) {
                    return true
                }
            }
        }
        return false
    }

//    fun reportSpam(message: Array<String>, bannedWords: Array<String>): Boolean {
//        val bannedSet = bannedWords.toSet()
//        return message.count { it in bannedSet } >= 2
//    }
}
