package org.example.vivek

class GroupAnagrams {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val anagramMap = mutableMapOf<String, MutableList<String>>()
        for (str in strs) {
            val key = str.toCharArray().sorted().joinToString("")
            if (anagramMap.containsKey(key)) {
                val value = anagramMap.getValue(key)
                value.add(str)
            } else {
                anagramMap.put(key, mutableListOf(str))
            }
        }
        return anagramMap.values.toList()
    }
}
