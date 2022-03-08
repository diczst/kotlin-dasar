fun main(){
    // collection selanjutnya adalah Set
    // set merupakan collection yang lebih ditujukan
    // untuk menyimpan sekumpulan objek
    // dengan nilai yang berbeda-beda

    // basic pendeklarasian set
    val setOfNumber = setOf(1,2,3,4,5)
    println(setOfNumber)

    // apabila ada nilai yang sama pada set?
    // maka secara otomatis akan disingkirkan
    // sehingga hanya diambil satu nilai saja
    // dari banyaknya yang sama itu
    val setOfNumberA = setOf(1,2,2,4,3,6,7,4,2)
    println(setOfNumberA)

    // kita dapat mengetahui irisan dan gabungan 
    val setC = setOf(1,5,7)
    val setD = setOf(2,3,4,6)
    val setE = setOf(2,3,6,9,10,11)

    val unionCD = setC.union(setD)
    val intersectionCD =setD.intersect(setE)

    println(unionCD)
    println(intersectionCD)

    // catatan
    // elemen set tidak bisa diubah meskipun
    // kita membuat mutable set
    // hanya bisa add dan remove elemen saja
}