fun main(){
    // apa itu named argument?
    // named argument adalah sebuah metode / cara
    // memberikan nilai argumen pada saat pemanggilan fungsi
    // tujuannya agar kita tak perlu memberikan argumen
    // sesuai urutan function

    // pemanggilan fungsi tanpa named argument
    simpleShowName("Dicky", "Pratama")

    // dengan named argument
    simpleShowName(lastName = "Pratama", firstName = "Dicky")


    // default argument
    // nilai argument yang akan diberikan jika
    // pada saat pemanggilan function
    // tidak ada nilai argument yang diberikan

    // pemanggilan function dengan default argument
    // jika tidak kita berikan argumen
    showName()

    // pemanggilan function dengan default argument
    // kita berikan sebagian saja argumen
    showName("Jane")
}

// sebuah function sederhana
fun simpleShowName(firstName: String, lastName: String){
    println("Nama saya adalah $firstName $lastName")
}

// sebuah function dengan default argument
fun showName(
    firstName: String = "John",
    lastName: String = "Doe"
){
    println("Nama saya adalah $firstName $lastName")
}