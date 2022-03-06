fun main(){
    // sintaks basic for loop kotlin
    // i akan mewakili tiap angka
    // perulangan akan dilakukan sebanyak
    // jumlah angka dalam rentang
    val ranges = 1..7
    for (i in ranges){
        println("Hello ke-$i")
    }

    println()

    // setiap range dapat memiliki index
    // dengan memanggil fungsi withIndex()
    for((index, value) in ranges.withIndex()){
        println("Angka $value dengan index $index")
    }

    println()

    // untuk mendapatkan tiap nilai
    // dalam range beserta indexnya
    // menggunakan foreach dapat dilakukan
    // dengan sintaks sbb
    ranges.forEachIndexed{index, element ->
        println("The number is $element with the index is $index")
    }

    println()

    // untuk mendapatkan nilai-nilai dalan range
    // dapat menggunakan for each
    ranges.forEach(){ number ->
        println("$number")
    }

}