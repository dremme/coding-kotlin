package strings

import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

/**
 * Testing string functions.
 */
fun main() {
    // Finding strings
    assertEquals(null, "ab".findLongestCommonSubstring("dc"))
    assertEquals("a", "a".findLongestCommonSubstring("aa"))
    assertEquals("fgh", "abcdefgh".findLongestCommonSubstring("abwxyzfghij"))

    // Special strings
    assertFalse("213a".isNumeric())
    assertTrue("12.345".isNumeric())
    assertTrue("-12".isNumeric())
    assertTrue("+12,345".isNumeric())

    assertFalse("Anno".isPalindrome())
    assertTrue("Anna".isPalindrome())
    assertTrue("Rentner".isPalindrome())

    // Converting strings
    assertEquals(0, "0".toInt())
    assertEquals(9, "9".toInt())
    assertEquals(12, "12".toInt())
    assertEquals(Int.MAX_VALUE, Int.MAX_VALUE.toString().toInt())

    assertEquals(0.0, "0".toDouble())
    assertEquals(3.141, "3.141".toDouble())
    assertEquals(-1.11, "-1.11".toDouble())
    assertEquals(1267831453.353, "1267831453.353".toDouble()) // TODO: might be unfair
}
