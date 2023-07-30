import java.math.BigInteger

//Here we should use BigInteger instead of Int data type because in Int data type for big value like num=50 it's get us 0 answer because of Int data type is a 32-bit signed integer, which means it can hold values from approximately -2 billion to +2 billion. The factorial of 50 is a very large number, and it exceeds the maximum value that an Int can represent, resulting in an overflow.
fun main()
{
    print("Enter number to find factorial : ")
    var s:String? = readLine()
    var num:BigInteger = s?.toBigInteger()?: BigInteger.ZERO

    if(num< BigInteger.ZERO)
    {
        println("Please enter valid number!!")
    }
    else
    {
        val result = factorial(num)
        val result2 = factorial2(num)
        println("Factorial of $num = $result")
        println("By tailrec keyword, Factorial of $num = $result2")
    }
}

    fun factorial(num:BigInteger):BigInteger {

    if(num== BigInteger.ZERO || num== BigInteger.ONE)
    {
        return BigInteger.ONE
    }

    else
    {
        return num * factorial(num- BigInteger.ONE)
    }
}

//fun factorial2(num: Int, acc: Int = 1): Int also give correct answer
// Without tail call optimization, each recursive call would add a new frame to the call stack, and if the recursion is deep (i.e., the number of recursive calls is large), it could eventually lead to a stack overflow error.
//By using the tailrec keyword, the compiler can recognize that the function is tail-recursive and replace the recursive calls with a loop, reusing the same stack frame for each iteration. This eliminates the need to create new stack frames, which significantly reduces the memory overhead and prevents stack overflow.
    tailrec fun factorial2(num: BigInteger, acc: BigInteger = BigInteger.ONE): BigInteger {
    if (num == BigInteger.ZERO || num == BigInteger.ONE) {
        return acc
    } else {
        return factorial2(num - BigInteger.ONE, acc * BigInteger.valueOf(num.toLong()))
    }
}