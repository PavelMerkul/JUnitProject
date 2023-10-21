import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.assertEquals
import ru.netology.TransferFeeCalculator

class TransferFeeCalculatorTest {

    @Test
    fun testCalculateFeeBelowMinimum() {
        val amount = 100.0
        val expectedFee = 35.0
        val actualFee = TransferFeeCalculator.calculateFee(amount)
        assertEquals(expectedFee, actualFee, 0.01)
    }

    @Test
    fun testCalculateFeeAboveMinimum() {
        val amount = 2000.0
        val expectedFee = 15.0 // 0.0075 * 2000
        val actualFee = TransferFeeCalculator.calculateFee(amount)
        assertEquals(expectedFee, actualFee, 0.01)
    }

    @Test
    fun testCalculateFeeWithMinimum() {
        val amount = 20.0
        val expectedFee = 35.0 // Минимальная комиссия
        val actualFee = TransferFeeCalculator.calculateFee(amount)
        assertEquals(expectedFee, actualFee, 0.01)
    }
}
