@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")

import kotlin.js.*

external interface Performance {
    var app: App
    fun trace(traceName: String): Trace
    var instrumentationEnabled: Boolean
    var dataCollectionEnabled: Boolean
}

external interface `T$8` {
    @nativeGetter
    operator fun get(key: String): Number?
    @nativeSetter
    operator fun set(key: String, value: Number)
}

external interface `T$9` {
    @nativeGetter
    operator fun get(key: String): String?
    @nativeSetter
    operator fun set(key: String, value: String)
}

external interface `T$10` {
    var metrics: `T$8`?
        get() = definedExternally
        set(value) = definedExternally
    var attributes: `T$9`?
        get() = definedExternally
        set(value) = definedExternally
}

external interface Trace {
    fun start()
    fun stop()
    fun record(startTime: Number, duration: Number, options: `T$10` = definedExternally)
    fun incrementMetric(metricName: String, num: Number = definedExternally)
    fun putMetric(metricName: String, num: Number)
    fun getMetric(metricName: String): Number
    fun putAttribute(attr: String, value: String)
    fun getAttribute(attr: String): String?
    fun removeAttribute(attr: String)
    fun getAttributes(): `T$9`
}