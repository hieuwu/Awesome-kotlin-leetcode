class AddTwoNumbers {
    companion object {
        fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
            val result: ListNode ?= null


            return result
        }
    }
}

class ListNode {
    var value: Int ? = null
    var next: ListNode ?= null
    fun goToLastNodeFromHead(head: ListNode): ListNode {
        var pFinder:ListNode  = head
        while(pFinder.next != null) {
            pFinder = pFinder.next!!
        }
        return pFinder
    }
    constructor(): super() {

    }
    constructor(aValue: Int){
        this.value = aValue
        this.next = null
    }


}

