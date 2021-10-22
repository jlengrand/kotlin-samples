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
import tsstdlib.Record

external interface `T$0` {
    var identifier: String?
        get() = definedExternally
        set(value) = definedExternally
    var optional: Boolean
}

external interface `T$1` {
    var identifier: String?
        get() = definedExternally
        set(value) = definedExternally
    var optional: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external open class Provider<T : Nothing?>(name: T, container: ComponentContainer) {
    open var name: Any
    open var container: Any
    open var component: Any
    open var instances: Any
    open var instancesDeferred: Any
    open var instancesOptions: Any
    open var onInitCallbacks: Any
    open fun get(identifier: String = definedExternally): Promise<Any>
    open fun getImmediate(options: `T$0`): Any
    open fun getImmediate(options: `T$1` = definedExternally): Any
    open fun getImmediate(): Any
    open fun getComponent(): Component<T>?
    open fun setComponent(component: Component<T>)
    open fun clearInstance(identifier: String = definedExternally)
    open fun delete(): Promise<Unit>
    open fun isComponentSet(): Boolean
    open fun isInitialized(identifier: String = definedExternally): Boolean
    open fun getOptions(identifier: String = definedExternally): Record<String, Any>
    open fun initialize(opts: InitializeOptions = definedExternally): Any
    open fun onInit(callback: OnInitCallBack<T>, identifier: String = definedExternally): () -> Unit
    open var invokeOnInitCallbacks: Any
    open var getOrInitializeService: Any
    open var normalizeInstanceIdentifier: Any
    open var shouldAutoInitialize: Any
}