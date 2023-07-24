open class person(var name:String="Mehul", var enroll_id:Int=118){
    init {
        println("Your name is $name")
    }

    fun display()
    {
        println("Your enrollment no is $enroll_id")
    }
}

class child(var cls:String="A"):person(){
    init {
        println("Your class is $cls")
    }
}

fun main()
{
    //init of parent will be called fisrt then init of child will be called
    // val ch = child()
    val ch = child("B")
    ch.display()
}