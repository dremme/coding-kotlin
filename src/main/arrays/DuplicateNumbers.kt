package arrays

/**
 * Finds the first duplicate number. Elements must be greater than zero.
 *
 * @return the duplicate number or `null` if the array is distinct.
 */
fun IntArray.findDuplicateNumber(): Int? {
    require(all { it > 0 })

    var last = 0
    forEach {
        if (it == last) return it
        last = it
    }
    return null
}
