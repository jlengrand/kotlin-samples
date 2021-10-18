@file:JsQualifier("remoteConfig")
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")

import kotlin.js.*

external interface `T$11` {
    @nativeGetter
    operator fun get(key: String): dynamic /* String? | Number? | Boolean? */
    @nativeSetter
    operator fun set(key: String, value: String)
    @nativeSetter
    operator fun set(key: String, value: Number)
    @nativeSetter
    operator fun set(key: String, value: Boolean)
}

external interface `T$12` {
    @nativeGetter
    operator fun get(key: String): Value?
    @nativeSetter
    operator fun set(key: String, value: Value)
}

external interface RemoteConfig {
    var app: App
    var settings: Settings
    var defaultConfig: `T$11`
    var fetchTimeMillis: Number
    var lastFetchStatus: String /* "no-fetch-yet" | "success" | "failure" | "throttle" */
    fun activate(): Promise<Boolean>
    fun ensureInitialized(): Promise<Unit>
    fun fetch(): Promise<Unit>
    fun fetchAndActivate(): Promise<Boolean>
    fun getAll(): `T$12`
    fun getBoolean(key: String): Boolean
    fun getNumber(key: String): Number
    fun getString(key: String): String
    fun getValue(key: String): Value
    fun setLogLevel(logLevel: String /* "debug" | "error" | "silent" */)
}

external interface Value {
    fun asBoolean(): Boolean
    fun asNumber(): Number
    fun asString(): String
    fun getSource(): String /* "static" | "default" | "remote" */
}

external interface Settings {
    var minimumFetchIntervalMillis: Number
    var fetchTimeoutMillis: Number
}

external fun isSupported(): Promise<Boolean>