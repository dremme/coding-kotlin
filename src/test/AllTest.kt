import kotlin.system.measureTimeMillis

private val ERRORS = mutableListOf<Throwable>()
private val TESTS = listOf(
    "Array" to { arrays.main() },
    "List" to { lists.main() },
    "String" to { strings.main() },
    "Tree" to { trees.main() },
    "Algorithm" to { algorithms.main() }
)

/**
 * Test all functions.
 */
fun main() {
    ERRORS.clear()
    val millis = measureTimeMillis {
        TESTS.forEach { (name, test) -> run(name, test) }
    }
    println()
    if (ERRORS.isEmpty()) {
        println("👍 All tests passed in $millis ms.")
    } else {
        println("${ERRORS.size} of ${TESTS.size} tests failed:")
        ERRORS.map(Throwable::printStackTrace)
    }
}

private fun run(name: String, block: () -> Unit) {
    try {
        val millis = measureTimeMillis(block)
        println("✅ $name tests passed in $millis ms.")
    } catch (e: Throwable) {
        ERRORS += e
        println("⚠️ $name tests failed.")
    }
}
