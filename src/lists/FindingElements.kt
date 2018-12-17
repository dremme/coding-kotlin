package lists

/**
 * Finds the middle element of a list with only one iteration.
 * Will find the higher element when the list has an even size.
 *
 * @param list a non-generic singularly linked list.
 *
 * @return the middle element or `null` if list is empty.
 */
fun findMiddleElement(list: LinkedList): Any? {
    var current = list.head
    if (list.head.next == null) return null

    var size = 0
    var middle = list.head.next!!

    while (current.next != null) {
        if (++size % 2 == 0) middle = middle.next!!
        current = current.next!!
    }

    return middle.value
}
