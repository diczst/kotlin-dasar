// Perbedaan class biasa dan data class

class User(val name: String, val age: Int)

// sintaks dasar data class
// cukup tambahkan keyword data sebelum class
data class DataUser(val name: String, val age: Int)

// data class dengan fungsi
data class Champ(val name: String, val power: Int){
    fun doFirstSkill(){
        println("$name do Hasagi with $power damage to the enemy")
    }
}


fun main() {
    val user = User("Friedrich", 29)
    val dataUser = DataUser("Nietzsche", 30)

    // class biasa mengembalikan alamat memori
    println(user)

        // data class mengembalikan sebuah string
    // berisi data properties yang ada pada class tersebut
    println(dataUser)

    // data class juga memungkinkan kita untuk
    // membandingkan dua objek data class
    // apakah memiliki kesamaan
    val userA = DataUser("Hasagi",20)
    val userB = DataUser("Hasagi",20)

    println(userA.equals(dataUser))
    println(userB.equals(userA))

    // perlu untuk menggunakan kode sendiri untuk melakukan pengecekan
    // untuk membandingan dua objek yang bukan dari data class

    // untuk mengambil nilai pada objek dapat menggunakan
    // fungsi componentN()
    val name = userB.component1()
    val age = userB.component2()
    println("User B name is $name and user B age is $age")

    // mengakses fungsi pada data class
    val yasuo = Champ("Yasuo",90)
    yasuo.doFirstSkill()

}