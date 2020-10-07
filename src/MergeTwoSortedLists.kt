class MergeTwoSortedLists {
    companion object {
        fun mergeTwoLists(l1: ListNode?, l2: ListNode?): ListNode? {
            if (l1 == null && l2 == null) {
                return null
            }
            var p1 = l1
            var p2 = l2
            var result: ListNode = ListNode(0)
            var p = result

            while (p1 != null && p2 != null) {
                if (p1.`val`!! < p2.`val`!!) {
                    p.next = p1
                    p1 = p1.next
                }
                else {
                    p.next = p2
                    p2 = p2.next
                }

                p = p.next!!
            }
            
            if(p1!=null){
                p.next = p1;
            }
            if(p2!=null){
                p.next = p2;
            }
            return result!!.next
        }
    }
}