import kotlinx.coroutines.*

// membuta sebuah job yang tidak langsung dijalankan
// dengan menambahkan CoroutineStart.LAZY


// job.start() akan melanjutkan pengeksekusian kode tanpa menunggu job selesai dieksekusi
fun main() = runBlocking {
    val job = launch(start = CoroutineStart.LAZY) {
        delay(1000L)
        println("Start new job!")
    }
 
    job.start()
    println("Other task")
}
/* OUTPUT
Other Task
Start new job!
 */

// dengan fungsi join() pengeksekusian kode mada coroutine utama
// akan terhenti sampai proses job itu selesai
fun main() = runBlocking {
    val job = launch(start = CoroutineStart.LAZY) {
        delay(1000L)
        println("Start new job!")
    }
 
    job.join()  // <-- terhenti 1 detik sebelum mengeksekusi baris selanjutnya
    println("Other task")
}
/* OUTPUT
Start new job!
Other Task
 */


 // membatalkan job
 fun main() = runBlocking {
    val job = launch {
        delay(5000)
        println("Start new job!")
    }
 
    delay(2000)
    job.cancel()
    println("Cancelling job...")
    if (job.isCancelled){
        println("Job is cancelled")
    }
}