fun main()
{
    print("Enter your enrollment no. : ")
    var s:String? = readLine()
    var enroll:Long = s?.toLong()?:0L

    print("Enter your name: ")
    var name:String? = readLine()

//    print("Enter your name: ")
//    var name:String = readln()

    println("YOUR ENROLLMENT NO: $enroll AND NAME: $name")
}