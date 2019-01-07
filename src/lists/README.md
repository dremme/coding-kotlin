# Linked Lists

Linked lists are a basic list type often used to realise stacks or queues.
They offer retrieving and removing the first and last element in `O(1)`, as well as prepending an element.
All other actions are done in `O(n)` for singly linked lists.

Here we will focus on a generic singly linked list like this:

```kotlin
class LinkedList<T> {

    var head: Node? = null
    private var tail = head

    fun add(node: Node) {
        if (head == null) head = node else tail?.next = node
        tail = node
    }

    inner class Node(var value: T, var next: Node? = null)

}
```

### Finding elements

Find the middle element at index `size / 2` rounded up, with only one loop or `null`.

```kotlin
fun findMiddleElement(list: LinkedList<Int>): Int?
```
---
Determine if the linked list contains a cycle, meaning a node points to another node in the list or itself.
This does not mean that the list is an actual circle. The cycle can occur at any point.

The function should only contain one loop. An empty list is not cyclic.

```kotlin
fun isCyclic(list: LinkedList<Int>): Boolean
```

### List manipulations

Reverse a linked list with one loop.

```kotlin
fun <T> reverseList(list: LinkedList<T>)
```