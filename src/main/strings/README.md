# Strings

A string is an array of characters, either as a literal constant or as some kind of variable.
It features many of the array functions.

### Finding strings

Find the longest common substring between two strings or `null`. The function should be reasonable efficient and not exceed `O(n^2)`.

```kotlin
fun String.findLongestCommonSubstring(other: String): String?
```

### Special strings

Check if a string is numeric. Allowed formats are `3,141`, `+3` or `-.141`.

```kotlin
fun String.isNumeric(): Boolean
```
---
Determine if a string is a palindrome (reads same forward and backward).

```kotlin
fun String.isPalindrome(): Boolean
```
---
Determine if a string contains balanced pairs of opening and closing braces (`'('` and `')'`), in `O(n)` time complexity

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
