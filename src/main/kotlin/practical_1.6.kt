fun main()
{
    print("Enter number 1: ")
    var s1: String? = readLine()
    var no1: Double = s1?.toDoubleOrNull() ?: 0.0

    print("Enter number 2: ")
    var s2: String? = readLine()
    var no2: Double = s2?.toDoubleOrNull() ?: 0.0

    arithmetic_operations(no1,no2)
}

fun arithmetic_operations(n1:Double,n2:Double)
{
    println("$n1 + $n2 = ${n1+n2}")
    println("$n1 - $n2 = ${n1-n2}")
    println("$n1 / $n2 = ${n1/n2}")
    println("$n1 * $n2 = ${n1*n2}")
    println("$n1 % $n2 = ${n1%n2}")
}