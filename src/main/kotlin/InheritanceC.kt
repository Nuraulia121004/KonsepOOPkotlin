package id.ac.polbeng.depandi.test_kelas

open class Teacher {
    // Must use " Open" modifier to allow child classes to ovveride it
    open fun teach(){
        println(" Teaching ...")
    }
    fun info(){
        println(" I 'am a Teacher.")
    }
}
class MathsTeacher : Teacher(){
    // Must use "override" modifier to override a base class function
    override fun teach() {
        println("Teaching Maths...")
    }
}

fun main() {
    val teacher = Teacher()
    val mathsTeacher = MathsTeacher()
    mathsTeacher.info()
    teacher.teach()
    mathsTeacher.teach()

}