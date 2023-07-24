fun main()
{
//    //var arr= Array<Int>(5){0}
//    var arr= Array(5){0}

//    var arraylist = arrayListOf(0,0,0,0,0)
//    for (i in 0..arraylist.size-1)
//    {
//        print("arr[$i]= ")
//        arraylist[i]= readLine()?.toInt()!!
//    }
//
//    println("Using built-in method Largest element= ${arraylist.max()}")
//
//    var arraylist2 = arrayListOf(0,0,0,0,0)
//
//    for (i in 0..arraylist2.size-1)
//    {
//        print("arr2[$i]= ")
//        arraylist2[i]= readLine()?.toInt()!!
//    }
//
//    var max=arraylist2[0]
//
//    for (i in 1..arraylist2.size-1)
//    {
//        if(arraylist2[i]>max)
//        {
//            max=arraylist2[i]
//        }
//    }
//    println("Without built-in method Largest element= ${max}")


    var arraylist1 = ArrayList<Int>(5)

    //println(arraylist1.size)
    //It will be 0

    for (i in 0 until  5)
    {
        print("arr[$i]= ")

        //not work
       // arraylist1[i]= readLine()?.toInt()!!

        //only add method will be worked
        var i = readLine()?.toInt()!!
        arraylist1.add(i)

    }

    println(arraylist1)
    println("Using built-in method Largest element= ${arraylist1.max()}")


    var arraylist2 = ArrayList<Int>(5)

    //println(arraylist1.size)
    //It will be 0

    for (i in 0 until  5)
    {
        print("arr[$i]= ")

        //not work
        // arraylist1[i]= readLine()?.toInt()!!

        //only add method will be worked
        var i = readLine()?.toInt()!!
        arraylist2.add(i)

    }

    //println(arraylist2.size)
    //It give 5
    var max=arraylist2[0]

    for (i in 1..arraylist2.size-1)
    {
        if(arraylist2[i]>max)
        {
            max=arraylist2[i]
        }
    }
    println(arraylist2)
    println("Without built-in method Largest element= $max")
}
