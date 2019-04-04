# Arrays

An array data structure, or simply an array, is a data structure consisting of a collection of elements (values or variables),
each identified by one array index.

An array is stored such that the position of each element can be computed from its index tuple by a mathematical formula.
Therefore, basic operations have a complexity of `O(1)`.

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

Reverse an array of integers in place in `O(n)`.

```kotlin
fun IntArray.reverse()
```
---
Flatten an array of arrays into an array of integers, e.g. turns `[[1], 2, [3, [4]]]` into `[1, 2, 3, 4]`.
No utility functions or other collections than arrays are allowed.

```kotlin
fun Array<*>.flatten(): IntArray
```
---
Transpose an array, creating a new array that is reflected over the main diagonal (top-left to bottom-right).
Space and time complexity should not exceed `O(n)`.

```kotlin
fun Array<IntArray>.transpose(): Array<IntArray>
```
