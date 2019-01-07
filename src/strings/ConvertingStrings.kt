package strings

private const val ASCII_ZERO = '0'.toInt()

/**
 * Converts a string of numeric characters into an unsigned integer.
 *
 * @return the converted string as integer.
 */
fun String.toInt(): Int {
    return map { it.toInt() - ASCII_ZERO }.fold(0) { acc, it -> acc * 10 + it }
}
