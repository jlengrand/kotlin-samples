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

external open class Component<T : Nothing?>(name: T, instanceFactory: InstanceFactory<T>, type: ComponentType) {
    open var name: T
    open var instanceFactory: InstanceFactory<T>
    open var type: ComponentType
    open var multipleInstances: Boolean
    open var serviceProps: Dictionary
    open var instantiationMode: InstantiationMode
    open var onInstanceCreated: onInstanceCreatedCallback<T>?
    open fun setInstantiationMode(mode: InstantiationMode): Component<T> /* this */
    open fun setMultipleInstances(multipleInstances: Boolean): Component<T> /* this */
    open fun setServiceProps(props: Dictionary): Component<T> /* this */
    open fun setInstanceCreatedCallback(callback: onInstanceCreatedCallback<T>): Component<T> /* this */
}

external open class Component__0 : Component<Nothing?>