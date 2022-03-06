fun main(){
    // setelah range maka yang akan dipelajari selanjutnya adalah for-loop
    // berbeda dengan sintaks for loop yang umum.
    // Pada kotlin, keyword range ini akan diperlukan untuk
    // menerapkan for loop

    // basic membuat range
    val rangeInt = 1..10

    // untuk menampilkan semua angka dalam range
    rangeInt.forEach { 
        print("$it ")
     }

     // it adalah default single implicit parameter pada kotlin
     // it dapat diganti dengan sintaks sebagai berikut

     // ganti single implicit parameter it dengan number
     rangeInt.forEach{ number -> 
        print("$number ")
     }


     println()

     // untuk melangkahi angka2
     // menggunakan keyword step
     val steppedRange = 1..10 step 2
     steppedRange.forEach {
         print("$it ")
     }
     
     println()

     // selain menggunakan titik dua
     // variabel range dapat dibuat menggunakan
     // method rangeTo()
     val rangeA = 1.rangeTo(20)
     rangeA.forEach {
         print("$it ")
     }

     println()

     // untuk menciptakan range dengan urutan angka
     // terkecil ke terbesar dapat menggunakan
     /// fungsi downTo()
     val rangeB = 15.downTo(1)
     rangeB.forEach{
         print("$it ")
     }

     println()

     // mengecek apakah suatu angka ada pada
     // range
     if(10 in rangeB){
         print("Sepuluh ada di rangeB")
     }

     println()

     // tipe data lain juga dapat
     // digunakan untuk menerapkan statement range
     val rangeChar = 'A'.rangeTo('G')
     rangeChar.forEach{
        print("$it")
     }
}