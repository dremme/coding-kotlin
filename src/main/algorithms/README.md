# Algorithms

An algorithm can be expressed within a finite amount of space and time. 
Starting from an initial state and initial input (perhaps empty), the instructions describe a computation that, when executed,
proceeds through a finite number of well-defined successive states, eventually producing "output" and terminating at a final ending state.

### Pancake Sort

Implement pancake sort. All elements of the array are greater than zero.

```kotlin
fun IntArray.pancakeSort()
```

Implement a helper function that flips the first `n` elements.
Pancake sort must use this function.

```kotlin
fun IntArray.flipN(n: Int)
```

The algorithms must work in place and in `O(1)` space complexity.
