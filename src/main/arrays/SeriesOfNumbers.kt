package arrays

/**
 * Finds the longest series of ascending integers without gaps.
 *
 * @return an array of the longest series of integers.
 */
fun IntArray.findLongestSeriesOfNumbers(): IntArray {
    if (isEmpty()) return intArrayOf()

    var currStart = 0
    var start = 0
    var end = 1

    (1 until size).forEach {
        if (this[it] != this[it - 1] + 1) currStart = it
        if (end - start < it + 1 - currStart) {
            start = currStart
            end = it + 1
        }
    }

    return copyOfRange(start, end)
}
