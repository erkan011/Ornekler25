fun main() {
    val sayilar = listOf(1, 2, 3, 4, 5)
    fun isCift(x: Int): Boolean {
        return x % 2 == 0
    }

    val ciftSayilar = sayilar.filter { element -> isCift(element) }
    println(ciftSayilar)
}