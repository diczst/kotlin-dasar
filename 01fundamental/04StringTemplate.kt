fun main(){
    // cara yang umum dalam menggabungkan objek string adalah dengan
    // dengan cara yang biasa disebut sebagai concatination

    // concatination
    val name = "Kotlin"
    println("Nama saya adalah " + name)


    // kotlin menyediakan caranya tersendiri
    // untuk meringkas dan mempermudah penggabungan
    // objek yang string yang disebut dengan string template

    // string template
    val fullName = "Friedrich Nietzsche"
    println("Nama saya adalah $fullName")
    
    // tak terbatas pada penggabungan objek string
    // bahkan objek dengan tipe data lain dapat digabungkan
    // dan secara otomatis dikonversi menjadi string
    // ini adalah kecanggihan yang dimiliki metode string template

    val age = 80;
    println("Nama saya adalah $fullName saya berumur $age")
    
    // bahkan kita dapat menyisipkan expression dengan string template
    val open = 7
    println(" Toko ${if (open < 16) "Dibuka" else "Ditutup"} ")

}