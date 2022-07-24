import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.equalTo
import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class Chapter2Test {
    @Test
    fun `Exercise 2_1 fibonacci recursion`() {

        val sequence = (0 until 10)
            .map { fib(it) }

        assertThat(sequence, equalTo(listOf(0, 1, 1, 2, 3, 5, 8, 13, 21, 34)))
    }

    @Test
    fun `Exercise 2_2 is sorted`() {
        assertTrue(isSorted(listOf(1, 4, 6, 7, 10, 11)) { a, b -> a < b })
        assertFalse(isSorted(listOf(1, 4, 7, 6, 10, 11)) { a, b -> a < b })
    }
}
