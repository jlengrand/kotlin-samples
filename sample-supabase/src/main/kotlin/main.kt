import kotlinx.browser.document
import kotlinx.browser.window
import kotlinx.html.div
import kotlinx.html.dom.append
import org.w3c.dom.Node

fun main() {
    window.onload = {
//        val supabase = createClient("", "", null)
//        console.log(supabase)
        document.body?.sayHello()
    }
}

fun Node.sayHello() {
    append {
        div {
            +"Hello from Sample Supabase"
        }
    }
}