//tailrec fun main()
fun main()
{
    print("Enter number to find factorial : ")
    var s:String? = readLine()
    var num:Int = s?.toIntOrNull()?:0

    if(num<0)
    {
        println("Please enter valid number!!")
    }
    else
    {
        val result = factorial(num)
        println("Factorial of $num = $result")
    }
}

fun factorial(num:Int):Int {

    if(num==0 || num==1)
    {
        return 1
    }

    else
    {
        return num * factorial(num-1)
    }
}