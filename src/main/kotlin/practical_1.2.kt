import java.lang.NumberFormatException

fun main()
{
    var i: Int = 5
    println("Integer to Double: ${i.toDouble()}")

    var s1: String = "123"
    println("String to Integer: ${s1.toInt()}")

    println("String to Double: ${s1.toDouble()}")

    var s2: String = "Mehul"

    try {
        println("String to Integer: ${s2.toInt()}")
    }
    catch (e: NumberFormatException)
    {
        println(e.message)
        println("Invalid format: $s2")
    }
}