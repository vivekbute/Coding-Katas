package rohan

import org.example.rohan.GroupAnagrams
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class GroupAnagramsTest{
    private val groupAnagrams = GroupAnagrams()

//    @Test
//    fun `Test single bracket valid string`() {
//        var output: List<List<String>> = listOf(
//            listOf("bat"),
//            listOf("nat", "tan"),
//            listOf("ate", "eat", "tea")
//        )
//        output = output.asReversed()
//        println("############################ $output")
//        assertEquals(true, output.containsAll(groupAnagrams.groupAnagrams(arrayOf("eat", "tea", "tan", "ate", "nat", "bat"))))
//    }

    @Test
    fun `Group the anagrams`() {
        val strs: Array<String> = arrayOf("eat", "tea", "tan", "ate", "nat", "bat")
        val output: List<List<String>> = listOf(
            listOf("bat"),
            listOf("nat", "tan"),
            listOf("ate", "eat", "tea")
        )
        assertEquals(true, compareListsWithoutOrder(output, groupAnagrams.groupAnagrams(strs)))
    }

    private fun compareListsWithoutOrder(list1: List<List<String>>, list2: List<List<String>>): Boolean {
        val set1 = list1.map { it.toSet() }.toSet()
        val set2 = list2.map { it.toSet() }.toSet()

        return set1 == set2
    }
}
