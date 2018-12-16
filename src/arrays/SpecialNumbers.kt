package arrays

/**
 * Finds the minimum and maximum values in an [array].
 *
 * @param array an array of integers. Elements can be any integer.
 *
 * @return a tuple of `(min, max)` or `null` if the [array] is empty.
 */
fun findMinMaxNumbers(array: IntArray): Pair<Int, Int>? {
    if (array.isEmpty()) return null

    var min = Int.MAX_VALUE
    var max = Int.MIN_VALUE
    array.forEach {
        min = if (min > it) it else min
        max = if (max < it) it else max
    }
    return min to max
}

/**
 * Finds all prime numbers in a given [array].
 *
 * @param array an array of integers. Elements are greater than zero.
 *
 * @return an array of prime numbers.
 */
fun findPrimeNumbers(array: IntArray): IntArray {
    require(array.all { it > 0 })

    var primeArray = intArrayOf()
    array.forEach { if (isPrime(it)) primeArray += it }
    return primeArray
}

/**
 * Almost any halfway efficient prime algorithm is acceptable here, but the steps required should not exceed the square
 * root of [number].
 */
private fun isPrime(number: Int): Boolean {
    if (number == 1) return false
    (2..sqrt(number)).forEach { if (number % it == 0) return false }
    return true
}

/**
 * Square root of an [Int] rounded to the nearest lower [Int].
 */
private fun sqrt(number: Int): Int {
    return Math.sqrt(number.toDouble()).toInt()
}
