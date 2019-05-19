package trees

/**
 * A generic non-balanced binary tree.
 * Use the [root] to start iteration.
 */
class BinaryTree<T : Comparable<T>> {

    /**
     * The root of the tree, i.e. the first element.
     */
    var root: Node? = null

    /**
     * Adds a value to the tree.
     *
     * @param value the value to add.
     */
    fun add(value: T) {
        root = root.insert(value)
    }

    private fun Node?.insert(value: T): Node {
        when {
            this == null -> return Node(value)
            this.value > value -> left = left.insert(value)
            else -> right = right.insert(value)
        }
        return this
    }

    /**
     * A node class, or element of the tree, containing a [value], a [left] and a [right] child.
     */
    inner class Node(var value: T, var left: Node? = null, var right: Node? = null)

}
