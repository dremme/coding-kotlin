package lists

/**
 * Reverses the list with one loop.
 */
fun <T> LinkedList<T>.reverse() {
    var pointer = head
    var current: LinkedList<T>.Node?
    var previous: LinkedList<T>.Node? = null

    while (pointer != null) {
        current = pointer
        pointer = pointer.next

        current.next = previous
        previous = current
        head = current
    }
}

/**
 * Creates a new distinct list (no duplicates) with the same order in `O(n)`.
 */
fun <T> LinkedList<T>.distinct(): LinkedList<T> {
    val set = mutableSetOf<T>()
    val list = LinkedList<T>()
    var current = head

    while (current != null) {
        if (set.add(current.value)) list.add(current.value)
        current = current.next
    }

    return list
}
