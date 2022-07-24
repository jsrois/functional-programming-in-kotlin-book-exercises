import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.equalTo
import org.junit.jupiter.api.Test

class Chapter2Test {
    @Test
    internal fun `Exercise 2_1 fibonacci recursion`() {

        val sequence = (0 until 10)
            .map { fib(it) }

        assertThat(sequence, equalTo(listOf(0, 1, 1, 2, 3, 5, 8, 13, 21, 34)))


    }
}
