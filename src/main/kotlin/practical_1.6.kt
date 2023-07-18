fun main()
{
    print("Enter number 1: ")
    var s1: String? = readLine()
    var no1: Double = s1?.toDoubleOrNull() ?: 0.0

    print("Enter number 2: ")
    var s2: String? = readLine()
    var no2: Double = s2?.toDoubleOrNull() ?: 0.0

    println("Addition of $no1 & $no2 is ${add(no1,no2)}")
    sub(no1,no2)
    mul(no1,no2)
    div(no1,no2)
    mod(no1,no2)
}

fun add(n1:Double,n2:Double):Double
{
    return n1+n2
}
fun sub(n1:Double,n2:Double)
{
    println("Subtraction of $n1 & $n2 is ${n1-n2}")
}

fun mul(n1:Double,n2:Double)
{
    println("Multiplication of $n1 & $n2 is ${n1*n2}")
}

fun div(n1:Double,n2:Double)
{
    println("Division of $n1 & $n2 is ${n1/n2}")
}

fun mod(n1:Double,n2:Double)
{
    println("Modulo of $n1 & $n2 is ${n1%n2}")
}