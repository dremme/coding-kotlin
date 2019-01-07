package arrays

/**
 * Reverses the array in place.
 */
fun IntArray.reverse() {
    (0 until size / 2).forEach {
        val temp = this[it]
        this[it] = this[size - it - 1]
        this[size - it - 1] = temp
    }
}

/**
 * Deeply flattens the array of arrays into a single layer, e.g. turns `[[1], 2, [3, [4]]]` into `[1, 2, 3, 4]`.
 *
 * @return an array of integers contained in the array of arrays.
 */
fun Array<*>.flatten(): IntArray {
    if (isEmpty()) return intArrayOf()

    var array = intArrayOf()
    forEach {
        if (it is Array<*>) array += it.flatten()
        else array += it as Int
    }
    return array
}
