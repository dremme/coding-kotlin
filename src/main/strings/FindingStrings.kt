package strings

/**
 * Finds the longest common substring of two strings in `O(n^2)`.
 *
 * @param other the other string.
 *
 * @return the longest common substring or `null` if there is none.
 */
fun String.findLongestCommonSubstring(other: String): String? {
    val current = StringBuilder()
    var result: String? = null
    var index = -1

    forEach {
        if (index >= 0 && it == other[++index]) {
            current.append(it)
        } else {
            current.clear()
            index = other.indexOf(it)
            if (index >= 0) current.append(it)
        }
        if (current.length > result?.length ?: 0) result = current.toString()
    }

    return result
}
