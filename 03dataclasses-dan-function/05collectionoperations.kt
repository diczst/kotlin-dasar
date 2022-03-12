fun main(){
    // collection operations
    // merupakan sekumpulan function yang digunakan
    // untuk melakukan operasi pada tiap
    // objek yang merupakan turunan dari collection

    // fungsi filter
    // menyaring elemen-elemen yang ada pada collection
    val setOfNumbers = setOf(1,2,3,4,5,6,7,8,9,10)
    
    // dengan edit parameter implisit dari it menjadi num
    val evenOnly = setOfNumbers.filter { num -> num % 2 == 0 }

    // atau bisa juga (tanpa edit parameter implisit)
    val oddOnly = setOfNumbers.filter {it % 2 != 0}

    println(evenOnly)
    println(oddOnly)

    // dengan filternot elemen yang dikembalikan adalah elemen yang tidak memenuhi
    // suatu kondisi yang ditentukan oleh filter
    val onlyOdd = setOfNumbers.filterNot { it % 2 == 0 }
    println(onlyOdd)


    // fungsi map
    // fungsi map digunakan untuk membuat collection baru
    // dengan mengoperasikan tiap elemen
    val someNumbers = listOf(1,3,4,5,6,1,2,6,7)
    val someNumbersMultiplied = someNumbers.map { it * 5 }
    println(someNumbersMultiplied)


    // fungsi count
    // mengembalikan jumlah elemen dalam collections
    println(someNumbers.count())

    // bisa menggunakan lambda
    // mengembalikan jumlah elemen yang memenuhi syarat
    // tampilkan jumlah bilangan ganjil dalam collection list someNumbers
    println(someNumbers.count {it % 2 != 0})

    // fungsi sum
    // menjumlahkan elemen elemen collection
    println(someNumbers.sum())

    // mengurutkan elemen (default ascending)
    println(someNumbers.sorted())

    // mengurutkan elemen secara descending (besar ke kecil)
    println(someNumbers.sortedDescending())

}