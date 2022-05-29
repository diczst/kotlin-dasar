/* 
Vararg adalah fitur yang memungkinkan kita untuk memasukkan banyak argumen (dengan tipe data yang sama) kedalam sebuah fungsi yang hanya memiliki sebuah parameter

*/

fun main() {
    // memasukkan argumen yang banyak (dengan tipe data yang sama)
    val number = sumNumbers(10, 20, 30, 40)
    print(number)
}
 
 // fungsi dengan satu parameter
fun sumNumbers(vararg number: Int): Int {
    return number.sum()
}

// Pada dasarnya vararg adalah sebuah array vararg dibutuhkan saat kita membutuhkan sebuah fungsi yang parameternya membutuhkan argumen yang tidak diketahui banyaknya (seperti arraylist)

// fungsi yang parameternya array maka argumennya haruslah array namun fungsi yang parameternya vararg, kita hanya perlu memasukkan argumen sebanyak yang dinginkan dan akan dikembalikan nilai dari operasi argumen-argumen tersebut.