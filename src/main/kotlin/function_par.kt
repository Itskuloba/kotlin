fun getfullname(firstname:String,lastname:String=""): String {

    return if (lastname.isNotEmpty()){
        "$firstname $lastname"
    }else{
        firstname
    }
}
fun calculatescore(correctanswer:Int,totalquentions:Int):Int{
    return(correctanswer*100)/totalquentions

}
fun main(args: Array<String>) {
    //  lambda function
    val sum ={num1:Int,num2:Int ->num1+num2}

    println("20+7 : ${sum(20,7)}")
    val stud1=getfullname("Nick","Onyi")
    println(stud1)
    val correctanswer=8
    val totalquentions=10
    val score=calculatescore(correctanswer,totalquentions)
    println("Yor score is: $score%")
}
// create a function that displays a complex calculator
// using input and output concepts