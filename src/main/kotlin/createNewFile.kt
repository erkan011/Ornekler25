import java.io.File

//import java.io.File
//
//fun main() {
//    val dosya = File("myfile.txt")
//    try {
//        dosya.writeText("Merhaba")
//        println("Dosya oluşturuldu")
//    } catch (e: Exception) {
//        e.printStackTrace()
//    }
//    dosya.delete()
//    println("Dosya silindi")
//}



//fun main() {
//    val dosya = File("myfile.txt")
//    try {
//        val outputStream = FileOutputStream(dosya)
//        outputStream.write("merhaba".toByteArray())
//        outputStream.close()
//        println("Dosya Oluşturuldu.")
//    }catch (e: Exception){
//        e.printStackTrace()
//    }
//}

fun main() {
    val dosya = File("metin.txt")
    try {
        //dosya.writeText("merhaba") //bu satır dosya oluşturma komurtudur.
        val metin = dosya.readText()
        println("Dosya içeriği: $metin")
    }catch (e: Exception){
        e.printStackTrace()
    }
    //dosya.delete() //dosyayı silme
}