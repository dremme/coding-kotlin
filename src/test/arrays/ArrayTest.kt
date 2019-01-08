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
    assertTrue(intArrayOf() contentEquals array1.findMissingNumbers(5))
    assertTrue(intArrayOf(2, 5, 7) contentEquals array2.findMissingNumbers(7))
    assertFails { array1.findMissingNumbers(0) }
    assertFails { array3.findMissingNumbers(1) }

    assertEquals(null, array1.findFirstMissingNumber())
    assertEquals(2, array2.findFirstMissingNumber())
    assertFails { array3.findFirstMissingNumber() }

    /*
     * Duplicate numbers
     */
    assertEquals(null, array1.findDuplicateNumber())
    assertEquals(3, array4.findDuplicateNumber())
    assertFails { array3.findDuplicateNumber() }

    /*
     * Special numbers
     */
    assertEquals(null, intArrayOf().findMinMaxNumbers())
    assertEquals(1 to 5, array1.findMinMaxNumbers())
    assertEquals(-1 to 1, array3.findMinMaxNumbers())

    assertTrue(intArrayOf() contentEquals intArrayOf(1, 4, 6).findPrimeNumbers())
    assertTrue(intArrayOf(2, 3, 5, 23, 101) contentEquals array5.findPrimeNumbers())
    assertFails { array3.findPrimeNumbers() }

    assertEquals(1, arrayOf<Any>().deepness())
    assertEquals(1, arrayOf(1, "2").deepness())
    assertEquals(3, arrayOf(arrayOf(1), 2, arrayOf(arrayOf(3)), 4).deepness())

    /*
     * Number series
     */
    assertTrue(intArrayOf() contentEquals intArrayOf().findLongestSeriesOfNumbers())
    assertTrue(intArrayOf(1) contentEquals intArrayOf(1).findLongestSeriesOfNumbers())
    assertTrue(intArrayOf(0) contentEquals intArrayOf(0, 2, 4, 6).findLongestSeriesOfNumbers())
    assertTrue(series6 contentEquals array6.findLongestSeriesOfNumbers())

    /*
     * Array manipulations
     */
    array1.reverse()
    array2.reverse()
    assertTrue(intArrayOf(5, 4, 3, 2, 1) contentEquals array1)
    assertTrue(intArrayOf(6, 4, 3, 1) contentEquals array2)

    assertTrue(intArrayOf() contentEquals arrayOf<Any>().flatten())
    assertTrue(intArrayOf(1, 2, 3, 4) contentEquals arrayOf(arrayOf(1), 2, arrayOf(3, arrayOf(4))).flatten())
}
