package lists

/**
 * A non-generic singularly linked list.
 * Use the [head] to start iteration.
 */
class LinkedList {

    /**
     * The head of the list, not an actual element of the list.
     */
    val head = Node(Unit)
    private var tail = head

    /**
     * Adds a value to the end of the list.
     *
     * @param value the value to add. Not `null`.
     */
    fun add(value: Any) {
        tail.next = Node(value)
        tail = tail.next!!
    }

    /**
     * A node class, or element of the list, containing a [value] and a [next] element or `null` if there is none.
     */
    inner class Node(var value: Any, var next: Node? = null)

}
