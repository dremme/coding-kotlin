package strings

import kotlin.test.assertEquals

/**
 * Testing string functions.
 */
fun main() {
    // Finding strings
    assertEquals(null, "ab".findLongestCommonSubstring("dc"))
    assertEquals("a", "a".findLongestCommonSubstring("aa"))
    assertEquals("fgh", "abcdefgh".findLongestCommonSubstring("abwxyzfghij"))

    // Converting strings
    assertEquals(0, "0".toInt())
    assertEquals(9, "9".toInt())
    assertEquals(12, "12".toInt())
    assertEquals(Int.MAX_VALUE, Int.MAX_VALUE.toString().toInt())
}
