fun main(){

    // kotlin menyediakan beberapa cara terbaru untuk melakukan pemanggilan 
    // suatu nullable object sehingga kita dapat meringkas kode
    // yang biasanya akan lebih panjang jika menggunakan cara tradisional

    // berikut adalah cara-cara pemanggilan nullable object

    // cara pertama
    //=== safe calls operator (?.) ===
    val text: String? = null
    text?.length

    // cara kedua
    //=== non-null assertion (!!) // ===
    val myNullableText: String? = null
    val textLength = myNullableText!!.length 
    print(textLength)
    
    // == perbedaan mendasar antara metode safe calls dan non-null assertion adalah === //

    // metode pengaksesan safe calls digunakan untuk pemanggilan nullable object
    // apabila suatu nullable object besar kemungkinan akan memiliki nilai null.

    // metode assertion digunakan apabila suatu nullable object, dipastikan berkemungkinan
    // besar memiliki nilai, meski objek itu diizinkan bernilai null.


    
    // cara bonus
    //=== elvis operator (?:) // ===
    // mengatur default value jika suatu nullable object bernilai null
    val name: String? = null
    val nameLength = name?.length ?: 100

    // cara klasik
    // val nameLength = if (text != null) text.length else 7

    
}