fun main() {
        var head = ListNode()
        var pFinder = head
        //add a value to list
        //create node with a value
        var aNode = ListNode(5)
        var aNode2 = ListNode(6)
        //Traverse over the list, last node.next -> newNode
        var lastNode = head.goToLastNodeFromHead(head)
        lastNode.next = aNode
        lastNode = head.goToLastNodeFromHead(head)
        lastNode.next = aNode2

        while (pFinder.next != null) {
                println("value: ${pFinder.value}")
                pFinder = pFinder.next!!
        }
        print("Done")
}