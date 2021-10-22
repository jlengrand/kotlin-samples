import kotlinx.html.div
import kotlinx.html.dom.append
import org.w3c.dom.Node
import kotlinx.browser.document
import kotlinx.browser.window
import kotlinx.html.p
import kotlin.js.Json
import kotlin.js.json

//// Import the functions you need from the SDKs you need
//import { initializeApp } from "firebase/firebase.app";
//import { getAnalytics } from "firebase/analytics";
//const firebaseConfig = {
//};
//
//const firebase.app = initializeApp(firebaseConfig);
//const analytics = getAnalytics(firebase.app);

//https://kotlinlang.slack.com/archives/C0B8L3U69/p1581012729254800
//https://github.com/lamba92/firebase-multiplatform/tree/9dccf3e1c8b19b5181e8f02266bf6775ecd53f2c/core/src/jsMain/kotlin
//https://youtrack.jetbrains.com/issue/KT-36427

@JsModule("is-sorted")
@JsNonModule
external fun <T> sorted(a: Array<T>): Boolean

fun main() {
//    startFirebase()
    window.onload = {
        val firebaseConfig = object : FirebaseOptions{}
        val fire = initializeApp(firebaseConfig)
        console.log(fire)
        console.log(sorted(arrayOf(1, 2, 3)))
        document.body?.sayHello() }
}

fun Node.sayHello() {
    append {
        div {
            +"Hello from JS"
        }
        p{
            sorted(arrayOf(1, 2, 3))
        }
    }
}