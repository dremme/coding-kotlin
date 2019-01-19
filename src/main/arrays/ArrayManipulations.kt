package arrays

/**
 * Reverses the array of integers in place.
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

/**
 * Transposes the matrix of integers. The matrix is reflected over its main diagonal (top-left to bottom-right).
 * The matrix does not have to be quadratic.
 *
 * Space and time complexity are both `O(n)`.
 *
 * @return the transposed matrix.
 */
fun Array<IntArray>.transpose(): Array<IntArray> {
    val rows = this.size
    val cols = this[0].size
    val array = Array(cols) { IntArray(rows) }

    (0 until cols).forEach { x ->
        (0 until rows).forEach { y ->
            array[x][y] = this[y][x]
        }
    }

    return array
}
