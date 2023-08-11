fun main(args: Array<String>) {
    var num=5
    if (num>10){
        println("The num is greater")
    }else{
        println("The num is less")
    }
    //if..elseif else statement
    val nambari=89
    if (nambari<0){
        println("Its a negative number")
    }else if (nambari>0 && nambari<10){
        println("Its a one digit number")
    }else if (nambari>=10 && nambari<100){
        println("Its a double digit number")
    }else
        println("It has 3 or more digits")
 //if..elseif statement to check marks
   // print("Enter your score: ")
    val score= 105
    if (score<50){
        println("Fail")
    }else if (score>50 && score<60){
        println("pass")
    }else if (score>60 && score<70){
        println("Credit")
    }else if (score>70 && score<100){
        println("Distinction")
    }else {
        println("Incorrect input")
    }
}