package leap_years

import org.junit.jupiter.api.Test
import kotlin.test.assertFailsWith
import kotlin.test.assertTrue
import kotlin.test.assertFalse

class TestLeapYears {
    @Test
    fun testIsNotLeapWhenNotDivisibleBy4() = assertFalse(Year(2001).isLeap())

    @Test
    fun testIsLeapWhenDivisibleBy4() = assertTrue(Year(2004).isLeap())

    @Test
    fun testIsNotLeapWhenDivisibleBy100() = assertFalse(Year(1900).isLeap())

    @Test
    fun testIsLeapWhenDivisibleBy400() = assertTrue(Year(2000).isLeap())

    @Test
    fun testRaisesNotGregorianYearWhenBefore1583() {
        assertFailsWith<NotGregorianYear> { Year(1500).isLeap() }
    }
}

