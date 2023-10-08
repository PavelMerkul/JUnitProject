package ru.netology

fun main() {
    val itemPrice = 100
    val itemCount = 11
    val discount = 100
    val discountStart = 1_000

//    val result = calculatePrice(itemCount, itemPrice, discount, discountStart)
//    val result = calculatePrice(itemCount)

//    val result = calculatePrice(1, userLevel = "gold")
    val result = calculatePrice(userLevel = "gold", itemCount = 1)

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


//fun userLevelToDiscount(level: String = "normal"): Double {
//    return when (level) {
//        "gold" -> 0.1
//        "silver" -> 0.05
//        else -> 0.0
//    }
//}

fun userLevelToDiscount(level: String = "normal") = when (level) {
    "gold" -> 0.1
    "silver" -> 0.05
    else -> 0.0
}



