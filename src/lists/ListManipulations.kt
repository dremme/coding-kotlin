package lists

/**
 * Reverses the given linked [list] with one loop.
 */
fun reverseList(list: LinkedList) {
    var pointer = list.head
    var current: LinkedList.Node?
    var previous: LinkedList.Node? = null

    while (pointer != null) {
        current = pointer
        pointer = pointer.next

        current.next = previous
        previous = current
        list.head = current
    }
}
