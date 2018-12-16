package arrays

/**
 * Finds the first duplicate number in an [array].
 *
 * @param array an array of integers. Elements must be greater than zero.
 *
 * @return the duplicate number or `null` if the [array] is distinct.
 */
fun findDuplicateNumber(array: IntArray): Int? {
    require(array.all { it > 0 })

    var last = 0
    array.forEach {
        if (it == last) return it
        last = it
    }
    return null
}
