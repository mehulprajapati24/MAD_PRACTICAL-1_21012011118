fun main()
{
    print("Enter your enrollment no. : ")
    var s:String? = readLine()
    var enroll:Long = s?.toLong()?:0L

    print("Enter your name: ")
    var name:String? = readLine()

    print("Enter your branch: ")
    var branch:String? = readLine()

    print("Enter your class: ")
    var cls:String? = readLine()

    print("Enter your batch: ")
    var batch:String? = readLine()

    print("Enter your college name: ")
    var college:String? = readLine()

    print("Enter your university name: ")
    var university:String? = readLine()

    print("Enter your age : ")
    var str:String? = readLine()
    var age:Int = str?.toInt()?:0
//    print("Enter your name: ")
//    var name:String = readln()

    println("********************************")
    println("Student's data: \nENROLLMENT NO: $enroll \nNAME: $name \nBRANCH: $branch \nCLASS: $cls \nBATCH: $batch \nCOLLEGE: $college \nUNIVERSITY: $university \nAGE: $age")
}