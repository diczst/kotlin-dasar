class Account{
    var name: String = "zenhakai"
        get(){
            println("Fungsi Getter terpanggil")
            return field
        }
        set(value){
            println("Fungsi Setter terpanggil")
            field = value
        }
}
 
fun main(){
    val acc1 = Account()
    // saat memanggil properties sebenarnya kita telah menggunakan method get dan saat melakukan assignment kita memanggil method set
    
    // tanpa override juga bisa, method get hanya mengembalikan nilai yang telah ada di dalam properties, begitu juga set yang hanya mengubah nilai yang ada di properties

    println("Nama: ${acc1.name}" )
    acc1.name = "hakaizeno"
    println("Nama: ${acc1.name}")
}