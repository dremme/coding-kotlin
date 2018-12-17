package lists

import kotlin.test.assertEquals

/**
 * Testing list functions.
 */
fun main() {
    val list1 = LinkedList()
    val list2 = LinkedList().addAll(1, 2, 3, 4, 5)
    val list3 = LinkedList().addAll(1, 2, 3, 4, 5, 6)

    /*
     * Missing numbers
     */
    assertEquals(null, findMiddleElement(list1))
    assertEquals(3, findMiddleElement(list2))
    assertEquals(4, findMiddleElement(list3))
}

/**
 * Adds all [elements] to the end of the list.
 */
private fun LinkedList.addAll(vararg elements: Any): LinkedList {
    elements.forEach(this::add)
    return this
}
