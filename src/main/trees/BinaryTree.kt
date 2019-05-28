package trees

/**
 * A generic binary tree.
 * Use the [root] to start iteration.
 */
class BinaryTree<T : Comparable<T>> {

    /**
     * The root of the tree, i.e. the first element.
     */
    var root: Node? = null

    /**
     * Inserts a value into the tree, following the rules of a binary search tree.
     */
    fun insert(value: T) {
        root = root.insert(value)
    }

    private fun Node?.insert(value: T): Node {
        when {
            this == null -> return Node(value)
            this.value < value -> right = right.insert(value)
            else -> left = left.insert(value)
        }
        return this
    }

    /**
     * Creates a list in order of the binary search tree rules `(L, S, R)`.
     */
    fun toList(node: Node? = root, list: MutableList<T> = mutableListOf()): List<T> {
        node?.let {
            toList(it.left, list)
            list += it.value
            toList(it.right, list)
        }
        return list
    }

    /**
     * A node class, or element of the tree, containing a [value], a [left] child element and [right] child element.
     * Children can be `null` if the node is a leaf or half-leaf..
     */
    inner class Node(var value: T, var left: Node? = null, var right: Node? = null)

}
