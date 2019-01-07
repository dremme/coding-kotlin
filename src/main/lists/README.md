# Linked Lists

Linked lists are a basic list type often used to realise stacks or queues.
They offer retrieving and removing the first and last element in `O(1)`, as well as prepending an element.
All other actions are done in `O(n)` for singly linked lists.

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
