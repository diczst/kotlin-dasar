fun main(){
    // list merupakan bagian dari collections
    // dalam kotlin

    // Collections
    // - List *
    // - Set
    // - Map

    // collections digunakan untuk menyimpan
    // banyak objek dalam sebuah objek

    // berbeda dengan array biasa
    // collection merupakan versi lebih moderen
    // dari array

    // collection sama seperti arraylist pada java
    // dimana kita dapat melakukan CRUD
    // dengan fungsi-fungsi yang ada

    // membuat list dasar
    val numList: List<Int> = listOf(1,2,3,4,5)
    val charList: List<Char> = listOf('a','b','c')

    // List pada kotlin bisa menyimpan
    // berbagai objek dengan tipe data yang berbeda
    // bahkan data class juga dapat menjadi elemen dari list
    val anyList = listOf('A', 20, "Hello", true)

    // untuk mengakses elemen dari list
    println(anyList[2])

    // secara default kotlin membuat sebuah list
    // bersifat immutable, artinya list dan elemen-elemen
    // dalam sebuah list tidak dapat diubah
    // nilainya

    // Akan tetapi, kotlin telah menyediakan fitur
    // untuk membuat list menjadi bersifat immutable

    val mutableList = mutableListOf("FirstName", 20)
    
    // tambahkan elemen baru di index terakhir
    mutableList.add("Kotlin")

    // tambahkan elemen pada indeks tertentu
    mutableList.add(1,"LastName")

    // ubah nilai pada elemen tertentu
    mutableList[0] = "Nietzsche"

    // menghapus elemen pada index tertentu
    mutableList.removeAt(2)

    println(mutableList)
}