fun printMessage(message: String): Unit {                               // 1
    println(message)
}

                                // 4

fun main() {
//    helloWorld()                                                  // 9
//    infixPlay()
//    operatorFunctions()
//    varargFunctions()
//    variables()
//    nullSafety()
//    println(describeString("hello"))
    val a = InitOrderDemo("Sam")
    println(a)
}




class Person(val n: String) {
    val name = n
    val likedPeople = mutableListOf<Person>()
    infix fun likes(other: Person) { likedPeople.add(other) }  // 6
}