fun main() {
    print("Enter number to check number is odd or even : ")
    var s: String? = readLine()
    var no: Int = s?.toInt() ?: 0

    println(if(no%2==0) "$no is even number" else "$no is odd number")
//  var result = if(no%2==0) "$no is even number" else "$no is odd number"
//  println(result)
}