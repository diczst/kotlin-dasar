fun main(){
    // terkadang keyword break dan keyword
    // continue diperlukan untuk kasus apabila
    // berkemungkinan terdapat nilai null
    // pada array atau kumpulan data

    val numbers = listOf(1,2,3,null,4,5,null)

    // jika ditampilkan semua elemen dari numbers
    // nilai null akan ditampilkan dan berkemungkinan
    // terjadi error
    for(number in numbers){
        print("$number ")
    }

    println()

    // agar lebih aman kita dapat menggunakan 
    // keyword continue untuk melangkahi pengeksekusian kode
    // apabila ada nilai yang null

    for(number in numbers){
        if (number == null) continue
        print("$number ")
    }

    println()

    // kita juga dapat menggunakan keyword break
    // untuk menghentikan perulangan bila terdapat
    // nilai yang null
    for(number in numbers){
        if(number == null) break
        print("$number ")
    }

}