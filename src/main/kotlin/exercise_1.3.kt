open class Person(var firstName:String, var lastName:String, var age:Int)
{
    init {
        println("primary constructor of Person class: first name=$firstName lastname=$lastName age=$age")
    }

    constructor(firstName: String, lastName: String):this(firstName,lastName,19)
    {
        println("secondary constructor of Person class: firstname=$firstName lastname=$lastName age=$age")
    }
}

class Student(firstName: String, lastName: String, age: Int, var enrollment:Int, var branch:String, var cls:String, var lab:String, var batch:String): Person(firstName, lastName, age)
{
    init {
        println("primary constructor of Student class: first name=$firstName lastname=$lastName age=$age enrollment=$enrollment branch=$branch class=$cls lab=$lab batch=$batch")
    }

    constructor(firstName: String):this(firstName,"Prajapati",19,118,"","","","")
    {
        println("secondary constructor of Student class: firstname=$firstName lastname=$lastName age=$age enrollment=$enrollment branch=$branch")
    }

//    how I call secondary constructor of Person
//    constructor(firstName: String, lastName: String, age: Int): super(firstName,lastName,age)
//    {
//        println("another secondary class of Student: firstname=$firstName, lastname=$lastName age=$age enrollment=$enrollment branch=$branch")
//    }
}

fun main()
{
    val students = ArrayList<Student>()

    students.add(Student("Mehul","Prajapati",20,1118,"CE","B","MAD","B-5"))
    students.add(Student("Jay"))

    for(i in students)
    {
        println("First name:${i.firstName} and enrollment:${i.enrollment} and branch:${i.branch}")
    }
}