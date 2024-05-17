fun <a> swap(x: a, y: a): Pair<a, a> {
    return Pair(y, x)
}

fun main() {
    val sayilar = Pair(10, 30)
    val metin = Pair("merhaba", "dünya")
    val swappedSayilar = swap(sayilar.first, sayilar.second)
    val swappedMetinler = swap(metin.first, metin.second)
    println("Sayilar: $swappedSayilar")
    println("Metinler: $swappedMetinler")
}