package ru.netology

class TransferFeeCalculator {
    companion object {
        // Константы для комиссии
        private const val COMMISSION_RATE = 0.0075 // 0.75%
        private const val MINIMUM_FEE = 35.0      // Минимальная комиссия 35 рублей

        // Метод для вычисления комиссии
        fun calculateFee(amount: Double): Double {
            // Вычисляем комиссию, учитывая минимальное значение
            var fee = amount * COMMISSION_RATE
            if (fee < MINIMUM_FEE) {
                fee = MINIMUM_FEE
            }
            return fee
        }
    }
}

fun main() {
    val itemPrice = 100
    val itemCount = 11
    val discount = 100
    val discountStart = 1_000

    val result = calculatePrice(itemCount, itemPrice, discount, discountStart)
    println("Total Price: $result")
}

fun calculatePrice(
    itemCount: Int,
    itemPrice: Int = 100,
    discount: Int = 100,
    discountStart: Int = 1_000,
    userLevel: String = "normal"
): Int {
    val total = itemPrice * itemCount
    val discounted = if (total > discountStart) total - discount else total
    return ((1 - userLevelToDiscount(userLevel)) * discounted).toInt()
}

fun userLevelToDiscount(level: String = "normal") = when (level) {
    "gold" -> 0.1
    "silver" -> 0.05
    else -> 0.0
}



