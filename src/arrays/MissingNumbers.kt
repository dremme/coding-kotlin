package arrays

import java.util.*

/**
 * Finds all missing numbers in an [array] up to the given [maximum] (inclusive).
 *
 * @param array   an array of integers. Elements must be greater than zero.
 * @param maximum the largest integer to be expected in the [array]. Greater than zero.
 *
 * @return an array of missing numbers or empty if none were missing.
 */
fun findMissingNumbers(array: IntArray, maximum: Int): IntArray {
    require(array.all { it > 0 })
    require(maximum > 0)

    val bitSet = BitSet(maximum)
    array.forEach { bitSet.set(it - 1) }

    val missingCount = maximum - array.size
    val missing = IntArray(missingCount)
    var lastIndex = 0
    (0 until missingCount).forEach {
        missing[it] = bitSet.nextClearBit(lastIndex) + 1
        lastIndex = missing[it]
    }
    return missing
}

/**
 * Finds the first missing number (or gap) in an [array].
 *
 * @param array an array of integers. Elements must be greater than zero.
 *
 * @return the missing number or `null` if none is missing.
 */
fun findFirstMissingNumber(array: IntArray): Int? {
    require(array.all { it > 0 })

    var expected = 0
    array.forEach { if (it != ++expected) return expected }
    return null
}
