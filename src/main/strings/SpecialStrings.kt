package strings

import java.util.ArrayDeque

private val SYMBOLS = setOf('.', ',', '+', '-')

/**
 * Checks if the string only contains numeric characters, e.g. `"-12.532"`.
 */
fun String.isNumeric(): Boolean {
    return all { Character.isDigit(it) || SYMBOLS.contains(it) }
}

/**
 * Determines if the string is a [palindrome](https://en.wikipedia.org/wiki/Palindrome), ignoring character case.
 */
fun String.isPalindrome(): Boolean {
    return (0 until length / 2).all { this[it].equals(this[length - it - 1], true) }
}

/**
 * Determines if the string contains balanced pairs of `(` and closing braces `)` in `O(n)` time complexity.
 */
fun String.isBalanced(): Boolean {
    var n = 0
    forEach {
        when (it) {
            '(' -> n++
            ')' -> n--
        }
    }
    return n == 0
}

/**
 * Determines if the string contains balanced pairs of `(` and closing braces `)` in `O(n)` time complexity
 * using a stack.
 */
fun String.isBalanced2(): Boolean {
    val stack = ArrayDeque<Char>()
    forEach {
        when (it) {
            '(' -> stack.push(it)
            ')' -> stack.pollFirst() ?: return false
        }
    }
    return stack.isEmpty()
}
