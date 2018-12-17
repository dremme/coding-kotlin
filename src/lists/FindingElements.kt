package lists

/**
 * Finds the middle element of a list with only one loop.
 * Will find the higher element when the list has an even size.
 *
 * @param list a non-generic singly linked list.
 *
 * @return the middle element or `null` if list is empty.
 */
fun findMiddleElement(list: LinkedList): Any? {
    var counter = 0
    var current = list.head
    var middle = current

    while (current != null) {
        if (++counter % 2 == 0) middle = middle?.next
        current = current.next
    }

    return middle?.value
}

/**
 * Determines if the list has a cycle at any point with only one loop.
 *
 * @param list a non-generic singly linked list.
 *
 * @return `true` if the list is cyclic. An empty list is not cyclic.
 */
fun isCyclic(list: LinkedList): Boolean {
    var counter = 0
    var fast = list.head
    var slow = fast

    while (fast != null) {
        fast = fast.next
        if (++counter % 2 == 0) slow = slow?.next
        if (fast == slow) return true
    }

    return false
}
