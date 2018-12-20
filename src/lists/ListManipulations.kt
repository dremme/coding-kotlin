package lists

/**
 * Reverses the given linked [list] with one loop.
 */
fun <T> reverseList(list: LinkedList<T>) {
    var pointer = list.head
    var current: LinkedList<T>.Node?
    var previous: LinkedList<T>.Node? = null

    while (pointer != null) {
        current = pointer
        pointer = pointer.next

        current.next = previous
        previous = current
        list.head = current
    }
}
