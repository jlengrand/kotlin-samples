@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")

import kotlin.js.*

external interface App {
    fun auth(): Auth
    fun database(url: String = definedExternally): Database
    fun delete(): Promise<Any>
    fun installations(): Installations
    fun messaging(): Messaging
    var name: String
    var automaticDataCollectionEnabled: Boolean
    var options: Any
    fun functions(regionOrCustomDomain: String = definedExternally): Functions
    fun performance(): Performance
    fun remoteConfig(): RemoteConfig
    fun analytics(): Analytics
    fun appCheck(): AppCheck
}