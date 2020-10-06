class RemoveNNodeFromEnd {
    companion object {
        fun removeNthFromEnd(head: ListNode?, n: Int): ListNode? {
            if (nodeCount(head) <= 1 && n ==1) {
                return null
            }
            var headCLone:ListNode? = head
            var p = head
            var i = nodeCount(head) - n
            if (i==0) {
                var newHead: ListNode? = head!!.next
                return newHead
            }
            println("Index: " + i)
            var ite  = 0
            while(p!!.next!= null && ite < i - 1) {
                ite++
                p = p.next
            }
            p.next = p.next!!.next
            return head
        }

        fun nodeCount(head: ListNode?): Int {
            var p = head
            var i: Int = 1
            while((p!!.next) != null) {
                i++
                p = p.next
            }
            return i
        }
    }
}