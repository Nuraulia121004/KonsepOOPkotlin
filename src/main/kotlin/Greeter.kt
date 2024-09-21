package id.ac.polbeng.depandi.test_kelas

import java.awt.SystemColor.text

class Greeter{
    var text : String = " "
    fun greet(){
        println("Hello Object World!")
    }
    fun greet(name: String){
        println("$text $name")
    }
    fun with_ret_val(name:String): String{
        return "$text $name"
    }
}