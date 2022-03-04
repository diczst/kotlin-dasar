fun main(){
    val value = 10

    // dasar sintaks control flow when expression
    when(value){
        6 -> println("value is 6")
        10 -> println("value is 10")
        else -> println("value cannot be reached")
    }

   // karena sintaks when merupakan expression
   // maka when bisa digunakan untuk melakukan
   // assignment value pada suatu variable

   // when expression jika digunakan untuk
   // assign nilai pada suatu variabel
   // maka wajib ada keyword else
   val stringValue = when(value){
        6 -> "value is 6"
        10 -> "value is 10"
        else -> "value cannot be reached"
    }
println(stringValue)

// jika ingin memasukkan banyak baris
// di perkondisian pada when expression maka
// gunakan kurung kurawal

val currentTime = 12
val now = when(currentTime){
    6 -> {
        println("Current time is 6")
        6
    }
    12 -> {
        println("Current time is 12")
        12
    }
    else -> {
        println("Current time not found")
        0
    }
}
println(now);

// bisa juga digunakan untuk mengecek tipe data
// atas class dari suatu objek

// tipe data Any akan mengikuti nilainya
val name: Any = "Hello World"
    when(name){
    is String -> println("name is string")
    is Int -> println("name is int")
    else -> println("undefined")
    }

// bisa digunakan juga untuk mengecek apakah suatu angka
// berada dalam rentang tertentu
val currentAge = 16
val ageRange = 10..20 // => 10 and <= 20

    when(currentAge){
        in ageRange -> println("Age in range")
        !in ageRange -> println("Age is outside the range")
        else -> println("value undefined")
    }

    // apa perbedaan when dan if ?
    // if lebih baik digunakan jika terdapat dua kemungkinan kondisi
    // jika kondisi yang mungkin terjadi sudah banyak
    // sebaiknya menggunakan when expression

    // when merupakan switch yang populer di berbagai bahasa pemrograman
    // hanya saja versi kotlinnya adalah when
}