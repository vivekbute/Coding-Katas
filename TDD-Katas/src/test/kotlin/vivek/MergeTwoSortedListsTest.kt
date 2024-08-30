package vivek

import org.example.vivek.ListNode
import org.example.vivek.MergeTwoSortedLists
import org.junit.jupiter.api.Test
import kotlin.test.assertContentEquals

class MergeTwoSortedListsTest {
    private val mergeTwoSortedLists = MergeTwoSortedLists()

    @Test
    fun `should return sorted list`() {
        val list1A = ListNode(1)
        val list1B = ListNode(2)
        val list1C = ListNode(3)
        list1A.next = list1B
        list1B.next = list1C

        val list2P = ListNode(1)
        val list2Q = ListNode(3)
        val list2R = ListNode(4)
        list2P.next = list2Q
        list2Q.next = list2R

        var arr = emptyArray<Int>()
        var response = mergeTwoSortedLists.mergeTwoLists(list1A, list2P)
        while (response != null) {
            arr = arr.plus(response.value)
            response = response.next
        }

        assertContentEquals(intArrayOf(1, 1, 2, 3, 3, 4).toTypedArray(), arr)
    }
}