package org.example.rohan

class GroupAnagrams {
    fun groupAnagrams(inputStr: Array<String>): List<List<String>> {
        if (inputStr.isEmpty()) return emptyList()

        val outputStr = mutableMapOf<String, MutableList<String>>()

        for (i in inputStr) {
            val eachValue = i.toCharArray()
            eachValue.sort()
            val key = String(eachValue)
            if (!outputStr.containsKey(key)) {
                outputStr[key] = mutableListOf()
            }
            outputStr[key]?.add(i)
        }
        return outputStr.values.toList()
    }
}

fun main() {
    val result = GroupAnagrams().groupAnagrams(arrayOf("eat", "tea", "tan", "ate", "nat", "bat"))
    println("******* $result")
}

//https://leetcode.com/problems/group-anagrams/description/
