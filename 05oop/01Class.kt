// STUDI KASUS NRO

// Membuat sebuah class
class Account(val name: String,
             val race: String,
             val hp: Int,
             val ki: Int,
             val attack: Int,
             val isLocked: Boolean
) {
 
    fun attack(){
        println("$name menyerang dengan damage $attack !")
    }
}


// main thread
fun main(){
    // membuat instance (object)
    val account1 = Account("zenokami", "earth", 100000, 50000, 4000, false);
    println("Nama Akun : ${account1.name}, HP : ${account1.hp}, KI : ${account1.ki}, Attack : ${account1.attack}")
    account1.attack();
}