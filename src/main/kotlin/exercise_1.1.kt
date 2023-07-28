fun main()
{
    //gives error
    //var n1=5, n2=6
    var n1=5
    var n2=6
    var n3=7
    var n4=8

    println("n1=$n1 and n2=$n2")

    var temp=n1
    n1=n2
    n2=temp

    println("using third variable after swapping, n1=$n1 and n2=$n2")

    println("n3=$n3 and n4=$n4")  //n3=7 and n4=8
    // in xor same bit then 0 otherwise 1
    n3 = n3 xor n4   // n3 = 0111 xor 1000 = 1111
    n4 = n3 xor n4   // n4 = 1111 xor 1000 = 0111 = 7
    n3 = n3 xor n4   // n3 = 1111 xor 0111 = 1000 = 8

    println("without using third variable after swapping, n3=$n3 and n4=$n4")
}