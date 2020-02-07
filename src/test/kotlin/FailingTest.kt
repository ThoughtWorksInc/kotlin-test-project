import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test
import strikt.api.expectThat
import strikt.assertions.isFalse

class FailingTest {
    @Test
    fun testThatFails() {
        assertTrue(false)
        expectThat(true)
                .isFalse()
        assertThat(true).isFalse()
    }
}
