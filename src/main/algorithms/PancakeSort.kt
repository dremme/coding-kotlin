package algorithms

/**
 * Sorts the array in place using pancake sort. Elements must be greater than zero.
 */
fun IntArray.pancakeSort() {
    require(all { it > 0 })

    (size downTo 0).forEach { length ->
        var maxIndex = -1
        var max = 0

        (0 until length).forEach {
            if (this[it] > max) {
                maxIndex = it
                max = this[it]
            }
        }

        flipN(maxIndex + 1)
        flipN(length)
    }
}

/**
 * Reverses the array up to, but excluding [n].
 *
 * @param n the upper bound (exclusively). Must be less or equal to [IntArray.size].
 */
fun IntArray.flipN(n: Int) {
    require(n <= size)

    (0 until n / 2).forEach {
        val temp = this[it]
        this[it] = this[n - it - 1]
        this[n - it - 1] = temp
    }
}
