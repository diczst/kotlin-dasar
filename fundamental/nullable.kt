fun main(){
    // deklarasi variabel bernilai null
    // akan error jika dijalankan karena sistem kotlin
    // tidak mengijinkan sebuah objek bernilai null
    // val text: String = null

    // dengan menambahkan tanda (?) sistem kotlin akan mengizinkan
    // suatu objek atau variabel bernilai null
    // dan dapat diatur kembali nilainya jika diperlukan
    val text: String? = null

    // meskipun objek atau variabel diatas bersifat nullable namun
    // kemungkinan terjadi error akan tetap terjadi karena nilainya yang masih null
    // sehingga kita perlu melakukan pengecekan sebelum menggunakan objek nullable
    
    // menggunakan nullable tanpa pengecekan apakah objek null (error)
    // print(text.length)

    // berikut adalah cara klasik yang umum untuk mengakses atau menggunakan sebuah variabel nullable
    if(text != null){
        print(text.length)
    }
}