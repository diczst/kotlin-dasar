fun main(){
    // deklarasi variabel bernilai null akan error jika dijalankan karena sistem kotlin
    // pada hakikatnya tidak mengijinkan sebuah variabel dideklarasikan dengan bernilai null
    // val text: String = null // error

    // Agar sistem kotlin mengijinkan suatu variabel dideklarasikan walaupun bernilai null maka
    // kita menggunakan tanda (?) setelah tipe data variabel

    var text: String? = null

    // karena suatu variabel atau objek diijinkan dideklarasikan dengan bernilai null
    // kemungkinan terjadinya error akibat null akan sangat berkemungkinan besar terjadi
    // oleh karena itu, sebelum menggunakan atau mengakses suatu nullable object
    // sebaiknya nullable object tersebut melalui pengecekan terlebih dahulu
    
    // menggunakan nullable object tanpa pengecekan
    // print(text.length) // error

    // berikut cara penggunaan atau pengaksesan sebuah variabel nullable
    // diserta idengan pengecekan nullnya

    // hanya akan dijalankan bila text tidak bernilai null
    if(text != null){
        print(text.length)
    }
}