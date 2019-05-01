fun variables() {
    var a: String = "initial"
    println(a)
    val b: Int = 1
    val c = 4
    var d = "hello"
}

fun nullSafety(){
    var neverNull: String = "This can't be null"            // 1


    var nullable: String? = "You can keep a null here"      // 3

    nullable = null                                         // 4

    var inferredNonNull = "The compiler assumes non-null"   // 5


    fun strLength(notNull: String): Int {                   // 7
        return notNull.length
    }
    strLength(neverNull)                                    // 8

}

fun describeString(maybeString: String?): String {              // 1
    if (maybeString != null && maybeString.length > 0) {        // 2
        return "String of length ${maybeString.length}"
    } else {
        return "Empty or null string"                           // 3
    }
}