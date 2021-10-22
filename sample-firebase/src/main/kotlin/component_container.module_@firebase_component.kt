@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")


external open class ComponentContainer(name: String) {
    open var name: Any
    open var providers: Any
    open fun <T : Nothing?> addComponent(component: Component<T>)
    open fun <T : Nothing?> addOrOverwriteComponent(component: Component<T>)
    open fun <T : Nothing?> getProvider(name: T): Provider<T>
    open fun getProviders(): Array<Provider<Nothing?>>
}