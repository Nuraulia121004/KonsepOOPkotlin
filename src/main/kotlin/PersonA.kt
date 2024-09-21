package id.ac.polbeng.depandi.test_kelas
class PersonA (_fisrtName : String,_lastName : String,_age: Int ){
    var firstName : String
    var lasName : String
    var age : Int
    init {
        firstName = _fisrtName
        lasName =_lastName
        age = _age
    }

}

fun main(args: Array<String>) {
    val budi = PersonA("Budi","Gunawan",21)
    println("Name : ${budi.firstName}${budi.lasName}")
    println("Age : ${budi.age}")
}