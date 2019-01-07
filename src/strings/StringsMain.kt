package strings

import kotlin.test.assertEquals

/**
 * Testing string functions.
 */
fun main() {
    // Converting strings
    assertEquals(0, convertToInt("0"))
    assertEquals(9, convertToInt("9"))
    assertEquals(12, convertToInt("12"))
    assertEquals(Int.MAX_VALUE, convertToInt(Int.MAX_VALUE.toString()))
}
