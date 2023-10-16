package ru.netology

import org.junit.Test

import org.junit.Assert.*

class MainKtTest {

    @Test
//    fun `calculatePrice shouldn't add discount`() {
    fun calculatePrice_shouldNotAddDiscount() {
        // arrange
        val count = 1
        val price = 0
        val discount = 10
        val start = 1_000
        val level = "gold"

        // act
        val result = calculatePrice(
            itemCount = count,
            itemPrice = price,
            discount = discount,
            discountStart = start,
            userLevel = level
        )

        // assert
        assertEquals(90, result)
    }

    @Test
    fun calculatePrice_shouldAddDiscount() {
        // arrange
        val count = 1
        val price = 1_000
        val discount = 10
        val start = 100
        val level = "gold"

        // act
        val result = calculatePrice(
            itemCount = count,
            itemPrice = price,
            discount = discount,
            discountStart = start,
            userLevel = level
        )

        // assert
        assertEquals(891, result)
    }
}
