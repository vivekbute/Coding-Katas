package org.example.vivek

class MergeTwoSortedLists {
    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
        val list3 = ListNode(0)
        var iterator = list3
        var l1 = list1
        var l2 = list2
        while (l1 != null && l2 != null) {
            if (l1.value <= l2.value) {
                iterator.next = l1
                l1 = l1.next
            } else {
                iterator.next = l2
                l2 = l2.next
            }
            iterator = iterator.next!!
        }

        if (l1 != null) {
            iterator.next = l1
        }
        if (l2 != null) {
            iterator.next = l2
        }
        return list3.next
    }
}

class ListNode(var value: Int) {
    var next: ListNode? = null
}
