import kotlinx.coroutines.*

fun main() = runBlocking {
    doHelloWorld() // returns only when scope is completed

    println("------")
    val job = launch {
        delay(1000L)
        println("World!")
    }
    println("Hello")
    job.join() // wait until child coroutine completes
    println("Done")


    println("------")
    repeat(100_000) { // launch a lot of coroutines
        launch {
            delay(5000L)
            print(".")
        }
    }
}

private suspend fun doHelloWorld() = coroutineScope {
    launch { doWorld("World 2", 2000L )}
    launch { doWorld() }
    println("Hello")
}

private suspend fun doWorld(message : String = "World", duration : Long = 1000L) {
    delay(duration)
    println(message)
}