package arrays

/**
 * Finds the minimum and maximum values. Elements can be any integer.
 *
 * @return a tuple of `(min, max)` or `null` if the array is empty.
 */
fun IntArray.findMinMaxNumbers(): Pair<Int, Int>? {
    if (isEmpty()) return null

    var min = Int.MAX_VALUE
    var max = Int.MIN_VALUE
    forEach {
        min = if (min > it) it else min
        max = if (max < it) it else max
    }
    return min to max
}

/**
 * Finds all prime numbers. Elements are greater than zero.
 *
 * @return an array of prime numbers.
 */
fun IntArray.findPrimeNumbers(): IntArray {
    require(all { it > 0 })

    var primeArray = intArrayOf()
    forEach { if (it.isPrime()) primeArray += it }
    return primeArray
}

/**
 * Almost any halfway efficient prime algorithm is acceptable here, but the steps required should not exceed the square
 * root of the number.
 */
private fun Int.isPrime(): Boolean {
    if (this == 1) return false
    (2..sqrt()).forEach { if (this % it == 0) return false }
    return true
}

/**
 * Square root rounded to the nearest lower integer.
 */
private fun Int.sqrt() = Math.sqrt(toDouble()).toInt()

/**
 * Determines the deepness of an array of arrays. A flat array (even if empty) has a deepness of `1`.
 */
fun Array<*>.deepness(): Int {
    return map { if (it is Array<*>) 1 + it.deepness() else 1 }.max() ?: 1
}
