class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

class SwapNodesInPairs {
    fun swapPairs(head: ListNode?): ListNode? {
        val dummy = ListNode(0)
        dummy.next = head
        var current = dummy

        while (current.next != null && current.next?.next != null) {
            // Identify the two nodes to swap
            // 0 -> 1 -> 2 -> 3 -> 4
            val first = current.next // 1
            val second = current.next?.next // 2

            // Swapping the nodes
            first?.next = second?.next
            second?.next = first
            current.next = second

            // Move the current pointer forward by two nodes
            current = first!!
        }

        return dummy.next
    }
}

fun main() {
    val swapNodes = SwapNodesInPairs()
    val list = ListNode(1)
    list.next = ListNode(2)
    list.next?.next = ListNode(3)
    list.next?.next?.next = ListNode(4)

    var ans = swapNodes.swapPairs(list)
    while (ans != null) {
        println(ans.`val`)
        ans = ans.next
    }
}