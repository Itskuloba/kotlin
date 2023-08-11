open class MpesaAccount(val phoneno:String,var balance:Double){

    open fun deposit(amount:Double){
        if (amount>0){
            balance+=amount
            println("Deposited $amount into account $phoneno.New balance is $balance ")
        }else{
            println("Invalid deposit")
        }
    }
    open fun withdraw(amount: Double){
        if (amount>0 && amount<=balance){
            println("Withdrawn $amount from account $phoneno.Balance:$balance")
        }else{
            println("insufficient balance")
        }
    }
}
class checkbalance(phoneno: String,balance: Double):MpesaAccount(phoneno, balance){
    fun sendmoney(receiverPhone:String,amount: Double){
        if (amount>0 && amount<=0){
            balance -=amount
            println("Sent $amount to account $receiverPhone. Balance :$balance")
        }else{
            println("Insufficient balance")
        }
    }

}

fun main(args: Array<String>) {
    val useraccount=checkbalance("1654846385",2335.0)
    val recieveraccount=checkbalance("6848465641",10000.0)

    useraccount.deposit(1400.0)
    useraccount.withdraw(350.0)
    useraccount.sendmoney(recieveraccount.phoneno,50.0)
}