fun main()
{
   // var arr1: Array<Int> = arrayOf(10,90,60,80,100)
    var arr1 = arrayOf(10,90,60,80,100)
    print("Create Array-1 by using arrayOf() method: ")
//    for(i in 0..arr1.size-1)
//    {
//        print("${arr1[i]} ")
//    }

    for(i in arr1)
    {
        print("$i ")
    }
    println()

   // var arr2 = Array(5){0}
    var arr2 = Array<Int>(5){0}
    print("Create Array-2 by using Array<>(): ")

    for(i in arr2)
    {
        print("$i ")
    }

    println()
    //var arr3 = Array<Int>(5){i:Int->i+1}
    //i start with 0
    //var arr3 = Array<Int>(5){i->i}
    var arr3 = Array<Int>(5){i:Int->i}
    print("Create Array-3 by using Array<>(): and lambda function: ")

    for(i in arr3)
    {
        print("$i ")
    }

    println()
    var arr4 = IntArray(5){0}
    print("Create Array-4 by using IntArray(): ")
    for(i in arr4)
    {
        print("$i ")
    }

    println()
    var arr5 = intArrayOf(19,18,5,1,10,12)
    print("Create Array-5 by using intArrayOf(): ")
    for(i in 5 downTo 0)
    {
        print("${arr5[i]} ")
    }

    println()
    var arr6 = arrayOf(intArrayOf(1,3), intArrayOf(4,5), intArrayOf(6,7))
    println("Create 2D Array-6 by using arrayOf() and intArrayOf():")
    for(i in arr6)
    {
        println(i.contentToString())
    }
    println(arr6.contentDeepToString())
    println(java.util.Arrays.deepToString(arr6))

//    for(j in 0..2)
//    {
//        for (i in arr6[j])
//        {
//            print("$i ")
//        }
//        println()
//    }

    //It will be print 0 1 2 3
//    var arr7:Array<Int> = arrayOf(0)
//    for(i in 0..3)
//    {
//        println(i)
//    }

    var arr7:Array<Int> = arrayOf(0,0,0,0,0)
    println("Please enter Array value: ")
//    for (i in 0..4)
    val range=0..4
    for(i in range){
        print("a[$i]=")
        arr7[i]= readLine()?.toInt()!!
    }

    println("Entered Array: ")
    println(java.util.Arrays.deepToString(arr7))


    println("After sorting by built-in function:")
    arr7.sort()
    println(java.util.Arrays.deepToString(arr7))


    println("Elements of Array:")
    var arr8:Array<Int> = arrayOf(56,23,49,12,2)
    println(java.util.Arrays.deepToString(arr8))
    //for (i in 0..arr8.size-1)
    for (i in 0..arr8.size-2)
    {
        for (j in i+1..arr8.size-1)
        {
            if(arr8[i]>arr8[j])
            {
                var temp=arr8[i]
                arr8[i]=arr8[j]
                arr8[j]=temp
            }
        }
    }
    println("After sorting without built-in function:")
    println(arr8.contentDeepToString())

    var arr9 = arrayOf(1,2,3,4,5)
    val result = arr9.joinToString(", ")
    print("result in string: [${result}]")
}