fun main() {
    val lastOrder = 10001
    val currentOrder = 1000
    val isUserMusicFan = false
    val standartDiscount = 100
    val firstDiscount = if ((1000 < lastOrder) && (lastOrder <= 10000)) {
        currentOrder - standartDiscount
    } else if (lastOrder > 10000) {
        currentOrder - currentOrder / 100 * 5
    } else currentOrder

    val totalDiscount = if (isUserMusicFan) {
        firstDiscount - firstDiscount / 100 * 1
    } else firstDiscount
    println("Покупка на сумму: $currentOrder рублей ->")
    println("После применения всех скидок: $totalDiscount рублей" )





}