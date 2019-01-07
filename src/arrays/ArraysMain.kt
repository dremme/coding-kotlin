package arrays

import kotlin.test.assertEquals
import kotlin.test.assertFails
import kotlin.test.assertTrue

/*
 * FIXME: we could solve these function with UInt and UIntArray, but they are not stable as of Kotlin 1.3.
 */

/**
 * Testing array functions.
 */
fun main() {
    val array1 = intArrayOf(1, 2, 3, 4, 5)
    val array2 = intArrayOf(1, 3, 4, 6)
    val array3 = intArrayOf(-1, 0, 1)
    val array4 = intArrayOf(1, 2, 3, 3, 4, 6)
    val array5 = intArrayOf(1, 2, 3, 4, 5, 6, 9, 21, 23, 101)
    val array6 = intArrayOf(0, 2, 3, 4, 6, 7, 10, 11, 12, 13, 14, 19, 20)
    val series6 = intArrayOf(10, 11, 12, 13, 14)

    /*
     * Missing numbers
     */
    assertTrue(intArrayOf() contentEquals findMissingNumbers(array1, 5))
    assertTrue(intArrayOf(2, 5, 7) contentEquals findMissingNumbers(array2, 7))
    assertFails { findMissingNumbers(array1, 0) }
    assertFails { findMissingNumbers(array3, 1) }

    assertEquals(null, findFirstMissingNumber(array1))
    assertEquals(2, findFirstMissingNumber(array2))
    assertFails { findFirstMissingNumber(array3) }

    /*
     * Duplicate numbers
     */
    assertEquals(null, findDuplicateNumber(array1))
    assertEquals(3, findDuplicateNumber(array4))
    assertFails { findDuplicateNumber(array3) }

    /*
     * Special numbers
     */
    assertEquals(null, findMinMaxNumbers(intArrayOf()))
    assertEquals(1 to 5, findMinMaxNumbers(array1))
    assertEquals(-1 to 1, findMinMaxNumbers(array3))

    assertTrue(intArrayOf() contentEquals findPrimeNumbers(intArrayOf(1, 4, 6)))
    assertTrue(intArrayOf(2, 3, 5, 23, 101) contentEquals findPrimeNumbers(array5))
    assertFails { findPrimeNumbers(array3) }

    /*
     * Number series
     */
    assertTrue(intArrayOf() contentEquals findLongestSeriesOfNumbers(intArrayOf()))
    assertTrue(intArrayOf(1) contentEquals findLongestSeriesOfNumbers(intArrayOf(1)))
    assertTrue(intArrayOf(0) contentEquals findLongestSeriesOfNumbers(intArrayOf(0, 2, 4, 6)))
    assertTrue(series6 contentEquals findLongestSeriesOfNumbers(array6))

    /*
     * Array manipulations
     */
    array1.reverse()
    array2.reverse()
    assertTrue(intArrayOf(5, 4, 3, 2, 1) contentEquals array1)
    assertTrue(intArrayOf(6, 4, 3, 1) contentEquals array2)

    assertTrue(intArrayOf() contentEquals arrayOf<Any>().flatten())
    assertTrue(intArrayOf(1, 2, 3, 4) contentEquals arrayOf<Any>(arrayOf(1), 2, arrayOf(3, arrayOf(4))).flatten())
}
