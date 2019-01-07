package lists

/**
 * Reverses the given linked [list] with one loop.
 */
fun <T> reverseList(list: LinkedList<T>) {
    var pointer = list.head
    var current: LinkedList<T>.Node<T>?
    var previous: LinkedList<T>.Node<T>? = null

    while (pointer != null) {
        current = pointer
        pointer = pointer.next

        current.next = previous
        previous = current
        list.head = current
    }
}
