class Wanafunzi(val jina:String,var miaka:Int){


}
class Walimu(val jina:String,var miaka:Int,val urefu:String){

}

fun main(args: Array<String>) {
    val mimi=Wanafunzi("Erick",30)
    println("Stud Name is:${mimi.jina} and age is ${mimi.miaka}")
    val yeye=Walimu("Becky",22,"Tall")
    println("Her name is ${yeye.jina}. She is ${yeye.miaka} years old and she is ${yeye.urefu}")
}
