# Strings

Strings are also very commonly asked in coding interviews. They are often implemented as array of characters, so the questions are very similar.

Parsing and regular expressions questions are very popular as well.

As with arrays algorithms are often required to have `O(n)` or even `O(1)` time complexity.

### Finding strings

Find the longest common substring between two strings or `null`. The function should be reasonable efficient and not exceed `O(n^2)`.

```kotlin
fun String.findLongestCommonSubstring(other: String): String?
```

### Special strings

Check if a string only contains numeric characters, without using regular expressions.

```kotlin
fun String.isNumeric(): Boolean
```
---
Determine if a string is a palindrome (reads same forward and backward).

```kotlin
fun String.isPalindrome(): Boolean
```
---
Determine if a string contains balanced pairs of opening and closing braces (`'('` and `')'`), in `O(1)` time complexity

```kotlin
fun String.isBalanced(): Boolean
 ```

### Converting strings

Convert a string of numeric characters into an integer (unsigned), without using and libraries or parsing functions.

```kotlin
fun String.toInt(): Int
```
---
Convert to a signed double like the above. The string is always a well formed string representation of a floating point number.

```kotlin
fun String.toDouble(): Double
```
