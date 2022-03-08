fun main(){
    // map merupakan turunan collection yang
    // menyimpan banyak objek dengan format key dan value
    // itu berarti untuk mengakses value pada objek
    // dibutuhkan key bukan index
    // key to value
    val bio = mapOf(
        "name" to "Nietzsche",
        "age" to 17,
        "known-as" to "Filsuf" 
    )

    // cara pengaksesan value
    println(bio["name"])
    println(bio.getValue("known-as"))

    // menampilkan semua key yang ada pada map

    // .keys akan mengembalikan sebuah set
    // karena key pada map haruslah bersifat unik
    // tidak boleh ada yang sama
    val bioKeys = bio.keys
    println(bioKeys)

    // sedangkan untuk menampilkan semua values
    // dapat menggunakan keyword .values
    val bioValues = bio.values
    println(bioValues)

    // map pada defaultnya bersifat immutable
    // sehingga kita tidak bisa menambahkan data
    // maupun mengedit data pada sebuah map

    // untuk membuat map yang dapat diubah-ubah
    // kita gunakan mutable map

    val mutableBio = bio.toMutableMap()
    mutableBio.put("desc", "Seorang filsuf yang terkenal dengan gagasannya Ubermensch atau adi manusia")
    println(mutableBio["desc"])
}