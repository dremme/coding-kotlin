package algorithms

/**
 * Testing sorting algorithm performance on random arrays.
 */
private fun main() {
    // Warm up phase
    randomArray(1000).pancakeSort()
    randomArray(1000).quicksort()
    randomArray(1000).sort()

    (2..6).forEach {
        val size = Math.pow(10.0, it.toDouble()).toInt()
        println("Sorting $size elements.")
        println()

        if (size <= Math.pow(10.0, 5.0).toInt()) {
            val startPanecake = System.currentTimeMillis()
            randomArray(size).pancakeSort()
            println("Pancake sort finished in ${System.currentTimeMillis() - startPanecake} ms.")
        }

        val quickStart = System.currentTimeMillis()
        randomArray(size).quicksort()
        println("Quicksort finished in ${System.currentTimeMillis() - quickStart} ms.")

        val nativeStart = System.currentTimeMillis()
        randomArray(size).sort()
        println("Array.sort() finished in ${System.currentTimeMillis() - nativeStart} ms.")
        println()
        println("=====")
    }
}

private fun randomArray(size: Int) = IntArray(size) { (Math.random() * 1000 + 1).toInt() }
