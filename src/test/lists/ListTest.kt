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
    val list5 = LinkedList<String>().addAll("1")
    val list4 = LinkedList<String>().addAll("1", "2", "3", "4")
    list4.head?.next?.next?.next?.next = list4.head?.next
    val list6 = LinkedList<Int>().addAll(5, 4, 3, 2, 1)
    val list7 = LinkedList<Int>().addAll(1)
    list7.head?.next = list7.head

    /*
     * Finding elements
     */
    assertEquals(0, list1.size())
    assertEquals(6, list3.size())
    assertEquals(6, list3.size(list3.head)) // Must use parameter because of the other size function

    assertEquals(null, list1.findMiddleElement())
    assertEquals(3, list2.findMiddleElement())
    assertEquals(4, list3.findMiddleElement())
    assertEquals("1", list5.findMiddleElement())

    assertEquals(null, list1.findNthLastElement(0))
    assertEquals(5, list2.findNthLastElement(0))
    assertEquals(2, list2.findNthLastElement(3))
    assertEquals(null, list5.findNthLastElement(3))

    assertFalse(list1.isCyclic())
    assertFalse(list2.isCyclic())
    assertTrue(list4.isCyclic())
    assertTrue(list7.isCyclic())

    /*
     * List manipulations
     */
    list1.reverse()
    list2.reverse()
    assertTrue(list6 contentEquals list2)

    assertTrue(list1 contentEquals LinkedList<Int>().distinct())
    assertTrue(
        LinkedList<Int>().addAll(6, 1, 2, 7, 8, 4)
                contentEquals LinkedList<Int>().addAll(6, 6, 1, 2, 7, 8, 8, 8, 4).distinct()
    )
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
