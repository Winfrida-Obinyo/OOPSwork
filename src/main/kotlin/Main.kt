import com.sun.tools.attach.AgentInitializationException

fun main() {
    var kem = Human("Winfrida",23,58)
    kem.eat(8)
    println(kem.weight)
    kem.speak("I am intelligent and smart")
    kem.birthday()
    println(kem.age)
var user = detail("Kemunto","Winnie","winniekemunto2gmail.com","0786549409","456@dey")
    println(user.email)
    println(user.password)

}
class Human(var name:String, var age:Int,var weight:Int) {
    fun eat(foodWeight: Int){
    println("I am eating $foodWeight Kgs of food")
        weight +=foodWeight
}
    fun speak(speech: String){
        println(speech)
    }
    fun birthday(){
        age +=1
    }
}
data class detail(var firstName:String, var lastName:String, var email:String, var phoneNumber:String,var password:String)


