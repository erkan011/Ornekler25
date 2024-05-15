fun great(name: String): String {
    return "hello, $name"
}

fun ornek() {
    println("Hello word")
}

fun printSum(a: Int, b: Int) {
    println(a + b)
}

fun multiPlay(x: Int, y: Int) = x + y

fun greet1(name1: String = "Word") {
    println("Hello, $name1")
}

fun formatText (text: String , prefix: String = "" , suffix: String = ""): String{
    return "$prefix$text$suffix"
}

fun main() {
    val greeting = great("Kotlin")
    println(greeting)

    ornek()

    printSum(3, 4)

    val result = multiPlay(5, 6)
    println(result)

    greet1()
    greet1("Alice")

    val formattext = formatText("kotlin", prefix = ">>", suffix = "<<")
    println(formattext)
}