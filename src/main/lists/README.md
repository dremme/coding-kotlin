# Linked Lists

A Linked list is a linear collection of data elements, whose order is not given by their physical placement in memory.
Instead, each element points to the next.
It is a data structure consisting of a collection of nodes which together represent a sequence.

Here we will focus on a generic singly linked list like this:

```kotlin
class LinkedList<T> {

    var head: Node<T>? = null
    private var tail = head

    fun add(value: T) {
        val node = Node(value)
        if (head == null) head = node else tail?.next = node
        tail = node
    }

    inner class Node<T>(var value: T, var next: Node<T>? = null)

}
```

### Finding elements

Determine the size of a linked list. Also determine the size recursively without helper functions.

```kotlin
fun LinkedList<*>.size(): Int
```
---
Find the middle element at index `size / 2` rounded up, with only one loop or `null`.

```kotlin
fun <T> LinkedList<T>.findMiddleElement(): T?
```
---
Find the `n`-th element from the end, with only one loop or `null`.
The last element would be `n = 0`, the second last `n = 1` and so forth.

```kotlin
fun <T> LinkedList<T>.findNthLastElement(n: Int): T?
```
---
Determine if the linked list contains a cycle, meaning a node points to another node in the list or itself.
This does not mean that the list is an actual circle. The cycle can occur at any point.

The function should only contain one loop. An empty list is not cyclic.

```kotlin
fun LinkedList<*>.isCyclic(): Boolean
```

### List manipulations

Reverse a linked list with one loop.

```kotlin
fun <T> LinkedList<T>.reverse()
```
---
Create a distinct linked list (no duplicates) from a linked list in `O(n)`. The new list must retain the original order.

```kotlin
fun <T> LinkedList<T>.distinct(): LinkedList<T>
```
