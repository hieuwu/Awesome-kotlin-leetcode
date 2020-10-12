class ValindromeLinkedList {
    companion object {
        fun isPalindrome(head: ListNode?): Boolean {
            if (head == null) {
                return true
            }
            var p = head
            var arr:ArrayList<Int>  = ArrayList<Int>()
            while(p!=null) {
                arr.add(p!!.`val`!!)
                p = p?.next
            }
            var i =0
            var n = arr.size
            while (i<=arr.size/2) {
                if (arr.get(i) != arr.get(n-i-1)) {
                    return false
                }
                i++
            }
            print(arr)
            return true
        }
    }
}