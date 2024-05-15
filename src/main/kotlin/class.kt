class Hayvan (private val isim: String, private val tur: String, private var yas: Int){
    fun bilgileriGoster(){
        println("İsim: $isim , Tür: $tur, Yaş: $yas")
    }
    fun yasiniArttir(){
        yas++
    }
}

fun main() {
    val kopek = Hayvan("Karabaş","Köpek",3)
    kopek.bilgileriGoster()
    kopek.yasiniArttir()
    kopek.bilgileriGoster()
}