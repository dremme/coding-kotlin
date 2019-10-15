package strings

import java.util.ArrayDeque

private val NUMBERS = setOf('0', '1', '2', '3', '4', '5', '6', '7', '8', '9')
private val SIGNS = setOf('+', '-')
private val SEPARATORS = setOf(',', '.')

/**
 * Checks if the string only contains numeric characters, e.g. `-12.532`.
 */
fun String.isNumeric(): Boolean {
    var separator = false
    val sign = if (SIGNS.contains(first())) 1 else 0
    drop(sign).dropLast(1).forEach {
        when {
            NUMBERS.contains(it) -> Unit
            SEPARATORS.contains(it) -> if (separator) return false else separator = true
            else -> return false
        }
    }
    return NUMBERS.contains(last())
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
    val stack = ArrayDeque<Char>()
    forEach {
        when (it) {
            '(' -> stack.push(it)
            ')' -> stack.pollFirst() ?: return false
        }
    }
    return stack.isEmpty()
}
