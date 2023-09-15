import kotlinx.coroutines.* //Siehe build.gradle.kts

fun main() = runBlocking {
    doWorld()
    //Im Anschluss, weil Blocking
    println("Done")
}

suspend fun doWorld() = coroutineScope {
    //Mehr verzögert
    launch {
        delay(2000L)
        println("World 2")
    }
    //Weniger verzögert
    launch {
        delay(1000L)
        println("World 1")
    }
    //Sofort
    println("Hello")
}
