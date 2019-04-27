package algorithms

import kotlin.test.assertFails
import kotlin.test.assertTrue

/**
 * Testing algorithms.
 */
fun main() {
    val array1 = intArrayOf(1, 2, 3, 4, 5)
    val array2 = intArrayOf(5, 2, 3, 1, 4)
    val array3 = intArrayOf(3, 2, 1, 4, 5)
    val array4 = intArrayOf(-1, 0, 1)

    // Pancake sort
    array1.flipN(3)
    assertTrue(array3 contentEquals array1)
    assertFails { array1.flipN(8) }

    array1.flipN(3)
    array2.pancakeSort()
    assertTrue(array1 contentEquals array2)
    assertFails { array4.pancakeSort() }

    val array5 = intArrayOf(5, 2, 7, 8, 1, 4, 6, 3)
    val array6 = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8)

    array5.quicksort()
    assertTrue { array5 contentEquals array6 }
}
