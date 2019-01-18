package strings

import java.util.ArrayDeque

private val SYMBOLS = setOf('.', ',', '+', '-')

/**
 * Checks if a string only contains numeric characters, e.g. `"-12.532"`.
 */
fun String.isNumeric(): Boolean {
    return all { Character.isDigit(it) || SYMBOLS.contains(it) }
}

/**
 * Determines if a string is a [palindrome](https://en.wikipedia.org/wiki/Palindrome), ignoring character case.
 */
fun String.isPalindrome(): Boolean {
    return (0 until length / 2).all { this[it].equals(this[length - it - 1], true) }
}

/**
 * Determines if a string contains balanced pairs of `(` and closing braces `)` in `O(n)` time complexity.
 */
fun String.isBalanced(): Boolean {
    val stack = ArrayDeque<Char>()
    forEach {
        if (it == '(') stack.push(it)
        else if (it == ')' && stack.isNotEmpty()) stack.pop()
        else if (it == ')' && stack.isEmpty()) return false
    }
    return stack.isEmpty()
}
