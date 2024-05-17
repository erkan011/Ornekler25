fun main() {
    val isim = "Erkan"

    fun selam(){
        val soyisim = "Çalışkan"
        println("Merhaba $isim $soyisim")
    }
    selam()
//    println(soyisim) //Hata oluşturacaktır çünkü soyisim sadece selam() fonksiyonunun kapsamındadır
}