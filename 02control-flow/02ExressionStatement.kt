// catatan penting //

fun main(){
    // statement adalah sintaks saat kita melakukan sesuatu seperti
    // membuat sebuah variabel, memanggil method print untuk menampilkan nilai, dsb

    // contoh statement
    val openStore = 7 // statement
    val now = 12 // statement

    // expression adalah sintaks yang menghasilkan nilai baru dari nilai atau objek lain
    // perhatikan bahwa (now > openStore) menghasilkan nilai true

    // contoh expression
    val status = if (now > openStore) "Toko A dibuka" else "Toko B ditutup" //expression
    print(status)


    // catatan tambahan
    // operator aritmathic, logic, relation, increment & decrement termasuk kedalam expression
    // sedangkan operator assignment termasuk kedalam statement

    // pada sebuah statement bisa terdapat sebuah expression
    // contoh sederhananya
    val myAge = 10 + 9

    // kode diatas disebut statement karena dia merupakan operator assignment
    // dalam statement diatas terdapat sebuah expression yaitu 10 + 9
}