# Binary Trees

A binary tree is a tree data structure in which each node has at most two children, which are referred to as the _left
child_ and the _right child_ or written as tuple `(L, S, R)`, where _L_ and _R_ are binary trees or the empty set and
_S_ is a singleton value.

In out case we only consider binary search trees where the _left child_ is smaller in comparison than the parent and the
_right child_ is greater or equal.

Nodes without children are called leafs, with one child half-leafs and the top most node is called the root.

A generic binary tree can look like this:

```kotlin
class BinaryTree<T : Comparable<T>> {

    var root: Node? = null

    inner class Node(var value: T, var left: Node? = null, var right: Node? = null)

}
```

### Tree functions

Implement adding a node to a binary search tree.

```kotlin
class BinaryTree<T : Comparable<T>> {

    fun insert(value: T)

}
```
