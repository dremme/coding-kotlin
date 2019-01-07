package strings

private const val ASCII_ZERO = '0'.toInt()

/**
 * Converts a string of numeric characters into an unsigned integer.
 *
 * @param text a string consisting of numeric characters.
 *
 * @return the converted string as integer.
 */
fun convertToInt(text: String): Int {
    return text.toCharArray()
        .map { it.toInt() - ASCII_ZERO }
        .fold(0) { acc, it -> acc * 10 + it }
}
