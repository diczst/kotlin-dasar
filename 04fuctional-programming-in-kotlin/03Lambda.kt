// Lambda expression, biasa disebut dengan anonymous function atau function literal atau fungsi tanpa nama (idenifier). Karena termasuk fungsi, lambda dapat memiliki parameter, body dan return type. 

// lambda dapat mengembalikan sebuah nilai ataupun tidak mengembalikan nilai apapun (hanya melakukan sesuatu)

// Ciri-ciri lambda expression
// 1. Tidak perlu menuliskan type data yang akan dikembalikan (dalam beberapa kasus harus didefisikan saat compiler tidak mengetahui type data yang akan dikembalikan)

// 2. Walaupun merupakan sebuah fungsi, lambda tidak membutuhkan kata kunci fun dan visibility modifier saat dideklarasikan, karena lambda bersifat anonymous.

// 3. Ketika ingin mengembalikan nilai, kata kunci return tidak diperlukan lagi karena kompiler akan secara otomatis mengembalikan nilai dari dalam body.

// 4. Lambda expression dapat digunakan sebagai argumen untuk sebuah parameter dan dapat disimpan ke dalam sebuah variabel.

// penerapan lambda expression

fun main() {
    // memanggil lambda function (tanpa return)
    message()
    printMessage("String Argument")

    // memanggil lambda function dengan return
    val length = messageLength("Hello From lambda")
    println("Message length $length")
}

// contoh deklarasi lambda function tanpa mengembalikan nilai
val message = { println("Hello From Lambda") }

// lambda function dengan parameter
val printMessage = { parameter: String -> println(parameter) }

// lambda function yang mengembalikan nilai
val messageLength = { message: String -> message.length }


