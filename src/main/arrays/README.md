# Arrays

Arrays are one of the most common data structures in programming. They are static in size and offer get and set in `O(1)`.
Copying values from one to another array can also be done in `O(1)`.

A lot of other data structures rely on arrays, so questions about array algorithms are quite common as well.

Of course often times it is __not__ allowed to use any libraries or utility functions provided by the programming language.
Also unnecessary intermediate array creation should be avoided and other collections are generally not allowed.

Method extensions and self-written utility functions _might_ be allowed.

### Missing numbers

Find all missing numbers (gaps) in an array of integers greater than zero, using the given maximum integer expected in that array.

```kotlin
fun IntArray.findMissingNumbers(maximum: Int): IntArray
```
---
Find the first missing number (gap) in an array of integers greater than zero or return `null`.

```kotlin
fun IntArray.findFirstMissingNumber(): Int?
```

### Duplicate numbers

Find the first duplicate number in an array of integers greater than zero or return `null`.

```kotlin
fun IntArray.findDuplicateNumber(): Int?
```

### Special numbers

Find the smallest and largest number is an array and return them as tuple `(min, max)` or return `null`.

```kotlin
fun IntArray.findMinMaxNumbers(): Pair<Int, Int>?
```
---
Find all prime numbers in an array. A helper-function `isPrime(n: Int)` is strongly advised.

```kotlin
fun IntArray.findPrimeNumbers(): IntArray
```
---
Determine the deepness of an array of arrays. A flat array has a deepness of `1`, also when it's empty.

```kotlin
fun Array<*>.deepness(): Int
```

### Number series

Find the longest series of ascending integers without gaps in an array in `O(n)` steps.

```kotlin
fun IntArray.findLongestSeriesOfNumbers(): IntArray
```

### Array manipulations

Reverse an array in place in `O(n)`.

```kotlin
fun IntArray.reverse()
```
---
Flatten an array of arrays into an array of integers, e.g. turns `[[1], 2, [3, [4]]]` into `[1, 2, 3, 4]`.
No utility functions or other collections than arrays are allowed.

```kotlin
fun Array<*>.flatten(): IntArray
```
