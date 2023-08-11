class People(val name:String,val age:Int,val gender:String){
 //  member function for intro
    fun jitambulishe(){
        println("Hi my name is $name im a $age year old $gender")



 }
 //   member function to have a birthday
    fun havebirthday(){
   //     age++
     println("$name has just turned $age")



 }
}

fun main(args: Array<String>) {
  // create an instance(objects) of the class
    val watu=People("John", 45, "Male")
    val watu1=People("Faith", 42, "Female")
    val watu2=People("Ashley", 48, "Female")






    watu.jitambulishe()
    watu.havebirthday()
    watu1.jitambulishe()
    watu1.havebirthday()
    watu2.jitambulishe()
    watu2.havebirthday()
}