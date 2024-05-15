//class Car private constructor(val brand: String){
//    companion object{
//        fun createCar(brand: String): Car{
//            return Car(brand)
//        }
//    }
//}
//
//fun main() {
//    val car = Car.createCar("Toyota")
//    println(car.brand)
//}
//class MyClass {
//    companion object {
//        const val DEFAULT_VALUE = 10
//        fun printMessage(){
//            println("Hello World")
//        }
//    }
//}
//
//fun main() {
//    println(MyClass.DEFAULT_VALUE)
//    MyClass.printMessage()
//}
class Example {
    init {
        instanceCount++
    }

    companion object {
        var instanceCount = 0
            private set
    }
}

fun main() {
    val example1 = Example()
    println(example1)
}