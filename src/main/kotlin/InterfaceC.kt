package id.ac.polbeng.depandi.test_kelas

interface X {
    fun demoX() {
        println("demoX function")
    }
    fun funcX()
}

interface Y  {
    fun demoY() {
        println("demoY function")
    }
    fun funcY()
}

// This class implements X and Y interfaces
class MyClassA: X, Y {
    override fun funcX() {
        println("Hello")
    }
    override fun funcY() {
        println("Hi")
    }

}

fun main() {
    val obj = MyClassA()
    obj.demoX()  // Memanggil demoX dari interface X
    obj.demoY()  // Memanggil demoY dari interface Y
    obj.funcX()  // Memanggil funcX dari MyClassA yang menampilkan "Hello"
    obj.funcY()  // Memanggil funcY dari MyClassA yang menampilkan "Hi"
}
