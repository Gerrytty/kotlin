import functions.User
import org.junit.Test
import java.lang.IllegalArgumentException
import kotlin.test.assertFailsWith

class MyTest {

    /***
     * Test that empty email field raises IllegalArgumentException
     ***/
    @Test
    fun testEmptyEmail() {
        assertFailsWith<IllegalArgumentException>(
            block = {
                User("First User", "").save()
            }
        )
    }

}