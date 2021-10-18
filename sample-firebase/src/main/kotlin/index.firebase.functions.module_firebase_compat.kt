@file:JsQualifier("functions")
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")

import kotlin.js.*

external interface HttpsCallableResult {
    var data: Any
}

external interface HttpsCallable {
    @nativeInvoke
    operator fun invoke(data: Any = definedExternally): Promise<HttpsCallableResult>
}

external interface HttpsCallableOptions {
    var timeout: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external open class Functions {
    open fun useEmulator(host: String, port: Number)
    open fun useFunctionsEmulator(url: String)
    open fun httpsCallable(name: String, options: HttpsCallableOptions = definedExternally): HttpsCallable
}