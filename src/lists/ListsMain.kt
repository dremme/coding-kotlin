package lists

import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

/**
 * Testing list functions.
 */
fun main() {
    val list1 = LinkedList<Int>()
    val list2 = LinkedList<Int>().addAll(1, 2, 3, 4, 5)
    val list3 = LinkedList<Int>().addAll(1, 2, 3, 4, 5, 6)
    val list5 = LinkedList<Int>().addAll(1)
    val list4 = LinkedList<Int>().addAll(1, 2, 3, 4)
    list4.head?.next?.next?.next?.next = list4.head?.next
    val list6 = LinkedList<Int>().addAll(5, 4, 3, 2, 1)
    val list7 = LinkedList<Int>().addAll(1)
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
private fun <T> LinkedList<T>.addAll(vararg elements: T) = apply { elements.forEach { this.add(it) } }

/**
 * Determines if the contents of the list is equal to an[other] list.
 */
private infix fun <T> LinkedList<T>.contentEquals(other: LinkedList<T>): Boolean {
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

/**
 * Determines the size of a linked list.
 */
private fun LinkedList<*>.size(): Int {
    var size = 0
    var current = head
    while (current != null) {
        current = current.next; size++
    }
    return size
}
