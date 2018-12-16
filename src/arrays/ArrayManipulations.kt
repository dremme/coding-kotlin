package arrays

/**
 * Reverses the given [array] in place.
 */
fun reverseArray(array: IntArray) {
    (0 until array.size / 2).forEach {
        val temp = array[it]
        array[it] = array[array.size - it - 1]
        array[array.size - it - 1] = temp
    }
}

/**
 * Flattens the given [arrayOfArrays] into a single layer, e.g. turns `[[1], 2, [3, [4]]]` into `[1, 2, 3, 4]`.
 *
 * @return an array of integers contained in the [arrayOfArrays].
 */
fun flattenArray(arrayOfArrays: Array<*>): IntArray {
    if (arrayOfArrays.isEmpty()) return intArrayOf()

    var array = intArrayOf()
    arrayOfArrays.forEach {
        if (it is Array<*>) array += flattenArray(it)
        else array += it as Int
    }
    return array
}
