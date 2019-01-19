package strings

private const val ASCII_ZERO = '0'.toInt()

/**
 * Converts the string of numeric characters into an unsigned integer.
 *
 * @return the converted string as integer.
 */
fun String.toInt(): Int {
    return map { it.toInt() - ASCII_ZERO }.fold(0) { acc, it -> acc * 10 + it }
}

/**
 * Converts the string of numeric characters into a signed double.
 *
 * @return the converted string as double.
 */
fun String.toDouble(): Double {
    var sign = 1.0
    var countPlaces = false
    var decimalPlaces = 0

    val number = fold(0L) { acc, it ->
        when (it) {
            '-' -> {
                sign = -1.0; acc
            }
            '.' -> {
                countPlaces = true; acc
            }
            else -> {
                if (countPlaces) decimalPlaces++
                acc * 10 + it.toInt() - ASCII_ZERO
            }
        }
    }

    return sign * number / Math.pow(10.0, decimalPlaces.toDouble())
}
