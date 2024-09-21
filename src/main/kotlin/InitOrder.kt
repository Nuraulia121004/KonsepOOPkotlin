package id.ac.polbeng.depandi.test_kelas

class InitOrder(name: String) {
    val firstProperty = "First property : $name".also(::println)

    init {
        println("First initializer block that prints ${name}")
    }
    val secondProperty = "Second property : ${name.length}".also(::println)
    init{
        println("Second initiliazer block that prints ${name.length}")
    }
}

fun main(args: Array<String>) {
    val initOrder = InitOrder("RPL")

}