package org.example.vivek

class ReportSpamMessage {
    //First solution
//    fun reportSpam(message: Array<String>, bannedWords: Array<String>): Boolean {
//        var count = 0
//        val msgMap = HashMap<String, Int?>()
//        val banned = bannedWords.toSet()
//        for (msg in message) {
//            if (msgMap.containsKey(msg)) {
//                msgMap[msg] = msgMap[msg]?.plus(1)
//            } else {
//                msgMap[msg] = 1
//            }
//        }
//        for (words in banned) {
//            if (msgMap.containsKey(words)) {
//                count += msgMap[words]!!
//            }
//        }
//        if (count >= 2) {
//            return true
//        } else {
//            return false
//        }
//    }

    // Second solution - optimized
    fun reportSpam(message: Array<String>, bannedWords: Array<String>): Boolean {
        val bannedWordsHashSet = hashSetOf<String>()
        var count = 0
        for (words in bannedWords) {
            bannedWordsHashSet.add(words)
        }

        for (msg in message) {
            if (bannedWordsHashSet.contains(msg)) {
                count++
            }
        }
        return count >= 2
    }
}