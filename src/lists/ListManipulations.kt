package lists

/**
 * Reverses the list with one loop.
 */
fun <T> LinkedList<T>.reverse() {
    var pointer = head
    var current: LinkedList<T>.Node<T>?
    var previous: LinkedList<T>.Node<T>? = null

    while (pointer != null) {
        current = pointer
        pointer = pointer.next

        current.next = previous
        previous = current
        head = current
    }
}
