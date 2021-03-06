package lists

/**
 * Determines the size.
 */
fun LinkedList<*>.size(): Int {
    var size = 0
    var current = head
    while (current != null) {
        current = current.next; size++
    }
    return size
}

/**
 * Determines the size recursively.
 */
fun LinkedList<*>.size(current: LinkedList<*>.Node? = head): Int {
    return if (current == null) 0 else size(current.next) + 1
}

/**
 * Finds the middle element with only one loop.
 * Will find the higher element when the list has an even size.
 *
 * @return the middle element or `null` if the list is empty.
 */
fun <T> LinkedList<T>.findMiddleElement(): T? {
    var counter = 0
    var current = head
    var middle = current

    while (current != null) {
        if (++counter % 2 == 0) middle = middle?.next
        current = current.next
    }

    return middle?.value
}

/**
 * Finds the [n]-th last element with only one loop.
 *
 * @param n the index from the end. `0` would be the last element, `1` the second last.
 *
 * @return the [n]-th element from the end or `null` if the list is empty or its size is less or equal to [n].
 */
fun <T> LinkedList<T>.findNthLastElement(n: Int): T? {
    var counter = 0
    var current = head
    var nth = head

    while (current != null) {
        current = current.next
        if (counter++ > n) nth = nth?.next
    }

    return if (counter < n) null else nth?.value
}

/**
 * Finds a cycle at any point of the list with only one loop.
 *
 * @return `true` if the list is cyclic. An empty list is not cyclic.
 */
fun LinkedList<*>.isCyclic(): Boolean {
    var counter = 0
    var fast = head
    var slow = fast

    while (fast != null) {
        fast = fast.next
        if (++counter % 2 == 0) slow = slow?.next
        if (fast == slow) return true
    }

    return false
}
