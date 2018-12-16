package arrays

/**
 * Finds the longest series of ascending integers without gaps in the given [array].
 *
 * @param array an array of integers.
 *
 * @return an array of the longest series of integers.
 */
fun findLongestSeriesOfNumbers(array: IntArray): IntArray {
    if (array.isEmpty()) return intArrayOf()

    var currStart = 0
    var start = 0
    var end = 1

    (1 until array.size).forEach {
        if (array[it] != array[it - 1] + 1) currStart = it
        if (end - start < it + 1 - currStart) {
            start = currStart
            end = it + 1
        }
    }
    return array.copyOfRange(start, end)
}
