fun String.toUpper(): String {
    return this.uppercase()
}
fun main() {
    val text = "merhaba dünya"
    val uppercase = text.toUpper()
    println(uppercase)
}