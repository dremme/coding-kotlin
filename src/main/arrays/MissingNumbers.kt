package arrays

import java.util.BitSet

/**
 * Finds all missing numbers up to the given [maximum] (inclusive). Elements must be greater than zero.
 *
 * @param maximum the largest integer to be expected in the array. Greater than zero.
 *
 * @return an array of missing numbers or empty if none were missing.
 */
fun IntArray.findMissingNumbers(maximum: Int): IntArray {
    require(all { it > 0 })
    require(maximum > 0)

    val bitSet = BitSet(maximum)
    forEach { bitSet.set(it - 1) }

    val missingCount = maximum - size
    val missing = IntArray(missingCount)
    var lastIndex = 0
    (0 until missingCount).forEach {
        missing[it] = bitSet.nextClearBit(lastIndex) + 1
        lastIndex = missing[it]
    }
    return missing
}

/**
 * Finds the first missing number (or gap). Elements must be greater than zero.
 *
 * @return the missing number or `null` if none is missing.
 */
fun IntArray.findFirstMissingNumber(): Int? {
    require(all { it > 0 })

    var expected = 0
    forEach { if (it != ++expected) return expected }
    return null
}
