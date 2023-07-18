fun main()
{
    print("Enter number of month which : ")
//    var s: String? = readLine()
//    var no: Int = s?.toIntOrNull() ?: 0

    var no:Int = readLine()!!.toInt()
    val month = when(no)
    {
        1 -> "January"
        2 -> "February"
        3 -> "March"
        4 -> "April"
        5 -> "May"
        6 -> "June"
        7 -> "July"
        8 -> "August"
        9 -> "September"
        10 -> "October"
        11 -> "November"
        12 -> "December"
        else -> "Invalid month"
    }

    println("Month name: $month")
}