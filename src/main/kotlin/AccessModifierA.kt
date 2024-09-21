package id.ac.polbeng.depandi.test_kelas

open class Mahasiswa(var nama: String, var nrp: Int) {
    open fun info() {
        println("$nama\n$nrp")
    }

    // Menggunakan override untuk menimpa metode toString dari superclass
    override fun toString(): String {
        return "Mahasiswa{nama= $nama, nrp= $nrp}"
    }
}

class KetuaHima(nama: String, nrp: Int, val jurusan: String) : Mahasiswa(nama, nrp) {
    // Menimpa metode info dari superclass Mahasiswa
    override fun info() {
        println("$nama\n$nrp\n$jurusan")
    }
}

fun main() {
    val budi = Mahasiswa("Budi Gunawan", 1106123)
    val anton = KetuaHima("Anton", 1106789, "Teknik Informatika")

    // Menampilkan informasi anton lebih dulu
    println(anton.toString())
    println()
    anton.info()
    println("Jenis Kelas = " + anton.javaClass.simpleName)
    println()

    // Menampilkan informasi budi di bawah anton
    budi.info()
    println("Jenis Kelas = " + budi.javaClass.simpleName)

    val ucok = KetuaHima("Ucok", 1105239, "Teknik Elektro")
    println()
    ucok.info()
    println("Jenis Kelas = " + ucok.javaClass.simpleName)
}
