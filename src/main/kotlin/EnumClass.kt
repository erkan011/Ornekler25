
enum class DaysOfWeek{
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
}

fun main() {
    for (day in DaysOfWeek.entries){
        println(day)
    }
}
//enum class DaysOfWeek(val deger: String) {
//    MONDAY("Pazartesi"),
//    TUESDAY("Salı"),
//    WEDNESDAY("Çarşamba"),
//    THURSDAY("Perşembe"),
//    FRIDAY("Cuma"),
//    SATURDAY("Cumartesi"),
//    SUNDAY("Pazar");
//
//    override fun toString(): String {
//        return deger
//    }
//}
//
//fun main() {
//    for (day in DaysOfWeek.values()) {
//        println(day)
//    }
//}