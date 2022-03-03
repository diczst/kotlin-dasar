fun main(){
    // statement adalah sintaks control flow yang tidak
    // mengembalikan nilai apapun berikut adalah
    // contoh sebuah statement

    // statement
    val openStore = 7
    val now = 12

    if(now > openStore)
        print("Toko dibuka")
    else
        print("Toko ditutup")

    
    // expression adalah sintaks control flow yang
    // mengembalikan sebuah nilai berikut adalah
    // contoh sebuah expression
    val openStoreA = 7
    val status = if (now > openStoreA) "Toko A dibuka" else "Toko B ditutup"
    print(status)

    // tambahan
    // pemanggilan return function merupakan sebuah expression juga
}