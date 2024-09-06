package vivek

import org.example.vivek.GroupAnagrams
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class GroupAnagramsTest{
    private val groupAnagrams = GroupAnagrams()

    @Test
    fun `Return grouped anagrams`() {
        val strs: Array<String> = arrayOf("eat", "tea", "tan", "ate", "nat", "bat")
        val output: List<List<String>> = listOf(
            listOf("bat"),
            listOf("nat", "tan"),
            listOf("ate", "eat", "tea")
        )

        assertEquals(true, compareListsWithoutOrder(output, groupAnagrams.groupAnagrams(strs)))
    }

    private fun compareListsWithoutOrder(list1: List<List<String>>, list2: List<List<String>>): Boolean {
        // Convert each list into a set of sets for easier comparison
        val set1 = list1.map { it.toSet() }.toSet()
        val set2 = list2.map { it.toSet() }.toSet()

        // Compare the sets
        return set1 == set2
    }
}