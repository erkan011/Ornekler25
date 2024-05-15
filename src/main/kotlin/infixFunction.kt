infix fun String.addToEnd(text: String): String{
    return this + text
}
fun main() {
    val str = "Merhaba, "
    val newStr = str addToEnd "Dünya"
    println(newStr)
}