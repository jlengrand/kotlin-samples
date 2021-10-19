import kotlinx.html.div
import kotlinx.html.dom.append
import org.w3c.dom.Node
import kotlinx.browser.document
import kotlinx.browser.window
import kotlinx.html.p
import kotlin.js.Json
import kotlin.js.json


//// Import the functions you need from the SDKs you need
//import { initializeApp } from "firebase/app";
//import { getAnalytics } from "firebase/analytics";
//const firebaseConfig = {
//};
//
//const app = initializeApp(firebaseConfig);
//const analytics = getAnalytics(app);

@JsModule("is-sorted")
@JsNonModule
external fun <T> sorted(a: Array<T>): Boolean

fun main() {
//    startFirebase()
    window.onload = {
        val firebaseConfig: Json = json()
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