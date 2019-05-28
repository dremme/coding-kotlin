package trees

import kotlin.test.assertEquals

fun main() {
    val numbers = 1..31
    val randomNumbers = numbers.shuffled()
    val sortedNumbers = numbers.toList()

    /*
     * Adding values
     */
    val tree1 = randomNumbers.toTree { insert(it) }

    assertEquals(randomNumbers.first(), tree1.root!!.value)
    assertEquals(sortedNumbers, tree1.toList())
}

private fun <T : Comparable<T>> List<T>.toTree(insertMethod: BinaryTree<T>.(T) -> Unit): BinaryTree<T> {
    val tree = BinaryTree<T>()
    forEach { tree.insertMethod(it) }
    return tree
}
