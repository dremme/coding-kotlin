package lists

import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

/**
 * Testing list functions.
 */
fun main() {
    val list1 = LinkedList()
    val list2 = LinkedList().addAll(1, 2, 3, 4, 5)
    val list3 = LinkedList().addAll(1, 2, 3, 4, 5, 6)
    val list5 = LinkedList().addAll(1)
    val list4 = LinkedList().addAll(1, 2, 3, 4)
    list4.head?.next?.next?.next?.next = list4.head?.next
    val list6 = LinkedList().addAll(5, 4, 3, 2, 1)
    val list7 = LinkedList().addAll(1)
    list7.head?.next = list7.head

    /*
     * Finding elements
     */
    assertEquals(null, findMiddleElement(list1))
    assertEquals(3, findMiddleElement(list2))
    assertEquals(4, findMiddleElement(list3))
    assertEquals(1, findMiddleElement(list5))

    assertFalse(isCyclic(list1))
    assertFalse(isCyclic(list2))
    assertTrue(isCyclic(list4))
    assertTrue(isCyclic(list7))

    /*
     * List manipulations
     */
    reverseList(list1)
    reverseList(list2)
    assertTrue(list6 contentEquals list2)
}

/**
 * Adds all [elements] to the end of the list.
 */
private fun LinkedList.addAll(vararg elements: Any): LinkedList {
    elements.forEach { this.add(Node(it)) }
    return this
}

/**
 * Determines if the contents of the list is equal to an[other] list.
 */
private infix fun LinkedList.contentEquals(other: LinkedList): Boolean {
    if (size() != other.size()) return false

    var current = head
    var otherCurrent = other.head

    while (current != null && otherCurrent != null) {
        if (current.value != otherCurrent.value) return false
        current = current.next
        otherCurrent = otherCurrent.next
    }

    return true
}

private fun LinkedList.size(): Int {
    var size = 0
    var current = head
    while (current != null) {
        current = current.next; size++
    }
    return size
}
