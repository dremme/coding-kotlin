package lists

/**
 * A generic singly linked list.
 * Use the [head] to start iteration.
 */
class LinkedList<T> {

    /**
     * The head of the list, i.e. the first element.
     */
    var head: Node? = null
    private var tail = head

    /**
     * Adds a value to the end of the list.
     *
     * @param node the element to add.
     */
    fun add(node: Node) {
        if (head == null) head = node else tail?.next = node
        tail = node
    }

    override fun toString(): String {
        val b = StringBuilder().append('[')
        var current = head
        while (current != null) {
            b.append(current).append(", "); current = current.next
        }
        return b.append(']').replace(", ]".toRegex(), "]")
    }

    /**
     * A node class, or element of the list, containing a [value] and a [next] element or `null` if there is none.
     */
    inner class Node(var value: T, var next: Node? = null) {
        override fun toString() = value.toString()
    }

}
