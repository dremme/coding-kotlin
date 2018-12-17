# Linked Lists

Linked lists are a basic list type often used to realise stacks or queues.
They offer retrieving and removing the first and last element in `O(1)`, as well as prepending an element.
All other actions are done in `O(n)` for singularly linked lists.

Here we will focus on a non-generic singularly linked list like this:

```kotlin
class LinkedList {

    val head = Node(Unit)
    private var tail = head

    fun add(value: Any) {
        tail.next = Node(value)
        tail = tail.next!!
    }

    inner class Node(var value: Any, var next: Node? = null)

}
```

### Finding elements

Find the middle element at index `size / 2` rounded up, with only one iteration or `null`.

```kotlin
fun findMiddleElement(list: LinkedList): Any?
```
