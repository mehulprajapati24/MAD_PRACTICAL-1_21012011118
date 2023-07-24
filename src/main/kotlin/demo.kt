class student(var enroll_no: Long, var name:String="MEHUL")
{
    constructor():this(21012011118)
    {
        println("Your enrollment no is $enroll_no and name is $name")
    }

    init
    {
        println("Enrollment no is $enroll_no and Name is $name")
    }
}

fun main(){
    //init will be called first and called only once time
    //init and constructor both are called
   // val obj1 = student()

    //init called
   // val obj2 = student(118)
    val obj2 = student(118,"mehul")
}