@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")

import kotlin.js.*
import org.khronos.webgl.*
import org.w3c.dom.*
import org.w3c.dom.events.*
import org.w3c.dom.parsing.*
import org.w3c.dom.svg.*
import org.w3c.dom.url.*
import org.w3c.fetch.*
import org.w3c.files.*
import org.w3c.notifications.*
import org.w3c.performance.*
import org.w3c.workers.*
import org.w3c.xhr.*

external enum class InstantiationMode {
    LAZY /* = "LAZY" */,
    EAGER /* = "EAGER" */,
    EXPLICIT /* = "EXPLICIT" */
}

external enum class ComponentType {
    PUBLIC /* = "PUBLIC" */,
    PRIVATE /* = "PRIVATE" */,
    VERSION /* = "VERSION" */
}

external interface InstanceFactoryOptions {
    var instanceIdentifier: String?
        get() = definedExternally
        set(value) = definedExternally
    var options: Any?
        get() = definedExternally
        set(value) = definedExternally
}

typealias InitializeOptions = InstanceFactoryOptions

typealias InstanceFactory<T> = (container: ComponentContainer, options: InstanceFactoryOptions) -> Any

typealias onInstanceCreatedCallback<T> = (container: ComponentContainer, instanceIdentifier: String, instance: Any) -> Unit

external interface Dictionary {
    @nativeGetter
    operator fun get(key: String): Any?
    @nativeSetter
    operator fun set(key: String, value: Any)
}

external interface NameServiceMapping

typealias OnInitCallBack<T> = (instance: Any, identifier: String) -> Unit