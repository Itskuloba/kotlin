fun complexcal(){

    println("Complex Calculator")
    print("Enter the first number: ")
    val num1= readLine()?.toDoubleOrNull()
    print("Enter the operator (+,-,*,/):")
    val operator= readln()

    print("Enter the second number: ")
    val num2= readLine()?.toDoubleOrNull()

    if (num1==null || operator==null||num2==null){
        println("Invalid input. Please put correct numbers and operator")
        return
    }
    val results=when(operator){
        "+"->num1+num2
        "-"->num1-num2
        "*"->num1*num2
        "/"-> if (num2 !=0.0) num1/num2 else "You can't divide by zero"
        else->"Invalid operator"

    }
    println("Answer is $results")
}
fun main(args: Array<String>) {
    complexcal()
}