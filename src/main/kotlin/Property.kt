class Person(val name: String, var age: Int) {
    val surname = "çalışkan"
    var address: String? = null
        get() {
            println("Address okunuyor...")
            return field
        }
        set(value) {
            println("address değiştiriliyor: $value")
            field = value
        }
}

fun main() {
    val person = Person("erkan" ,22)
    println(person.age)
    println(person.name)
    person.address = "gaziantep"
    println(person.address)
    println(person.surname)
}