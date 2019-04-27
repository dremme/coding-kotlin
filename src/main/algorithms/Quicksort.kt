package algorithms

/**
 * Sorts the array using quicksort. Elements must be greater than zero.
 */
fun IntArray.quicksort() {
    require(all { it > 0 })
    quicksort(0, size - 1)
}

/**
 * Quicksort algorithm picking the highest element as pivot,
 * so elements are only shifted to the right if they are
 */
private fun IntArray.quicksort(from: Int, to: Int) {
    if (from < to) {
        val pivot = this[to]
        var index = from

        (from..to).forEach {
            if (this[it] < pivot) swap(index++, it)
        }
        swap(index, to)

        quicksort(from, index - 1)
        quicksort(index + 1, to)
    }
}

private fun IntArray.swap(a: Int, b: Int) {
    val temp = this[a]
    this[a] = this[b]
    this[b] = temp
}
