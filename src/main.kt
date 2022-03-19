//Create a class called Human with these attributes: name, age, weight.
// It has the following functions:
//-eat(foodWeight: Int) :Prints “I am eating {foodWeight}kgs of food”
//and increments the human’s weight by the weight of the food eaten
//-speak(speech: String) :Prints the string passed to it
//-birthday( ) :Increments the human’s age by 1
//Create  an instance of this human class and invoke all its functions

fun main() {
    var me=Human("Naima", 21, 45)
    var me2=Human("Salim", 50, 67)
    println(me2.name)
    println(me2.age)
    println(me2.weight)
    me.eat(29)
    println(me.weight)
    me.speak("i have a speech")
    me.birthday()



    var user=AnitaB("Tut", "Nyawera", "nyaweratut@gmail.com", 769523085, "Salim")
    println(user.email)
    println(user.password)



}
class Human(var name:String, var age:Int, var weight:Int) {

    fun eat(foodWeight:Int){
        println("i am eating $foodWeight kgs of food")
        weight+=foodWeight


    }
    fun speak(speech:String){
        println(speech)

    }
    fun birthday(){
        age+=1
        println(age)

    }

}

//Create a data class User with these fields: firstName, lastName, email,phoneNumber, password.
// Create an instance of User  and print out any 2 attributes

data class AnitaB(var firstName:String, var lastName:String, var email:String, var phoneNumber:Int, var password:String){

}