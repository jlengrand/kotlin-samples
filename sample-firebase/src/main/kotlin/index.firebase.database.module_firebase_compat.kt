@file:JsQualifier("database")
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")

import kotlin.js.*

external interface DataSnapshot {
    fun child(path: String): DataSnapshot
    fun exists(): Boolean
    fun exportVal(): Any
    fun forEach(action: (a: DataSnapshot) -> Any): Boolean
    fun getPriority(): dynamic /* String? | Number? */
    fun hasChild(path: String): Boolean
    fun hasChildren(): Boolean
    var key: String?
    fun numChildren(): Number
    fun `val`(): Any
    var ref: Reference
    fun toJSON(): Any?
}

external interface `T$36` {
    var mockUserToken: dynamic /* typealias EmulatorMockTokenOptions = dynamic | String? */
        get() = definedExternally
        set(value) = definedExternally
}

external interface Database {
    var app: App
    fun useEmulator(host: String, port: Number, options: `T$36` = definedExternally)
    fun goOffline(): Any
    fun goOnline(): Any
    fun ref(path: String = definedExternally): Reference
    fun refFromURL(url: String): Reference
}

external interface OnDisconnect {
    fun cancel(onComplete: (a: Error?) -> Any = definedExternally): Promise<Any>
    fun remove(onComplete: (a: Error?) -> Any = definedExternally): Promise<Any>
    fun set(value: Any, onComplete: (a: Error?) -> Any = definedExternally): Promise<Any>
    fun setWithPriority(value: Any, priority: Number?, onComplete: (a: Error?) -> Any = definedExternally): Promise<Any>
    fun setWithPriority(value: Any, priority: Number?): Promise<Any>
    fun setWithPriority(value: Any, priority: String?, onComplete: (a: Error?) -> Any = definedExternally): Promise<Any>
    fun setWithPriority(value: Any, priority: String?): Promise<Any>
    fun update(values: Any, onComplete: (a: Error?) -> Any = definedExternally): Promise<Any>
}

external interface Query {
    fun endAt(value: Number?, key: String = definedExternally): Query
    fun endAt(value: Number?): Query
    fun endAt(value: String?, key: String = definedExternally): Query
    fun endAt(value: String?): Query
    fun endAt(value: Boolean?, key: String = definedExternally): Query
    fun endAt(value: Boolean?): Query
    fun endBefore(value: Number?, key: String = definedExternally): Query
    fun endBefore(value: Number?): Query
    fun endBefore(value: String?, key: String = definedExternally): Query
    fun endBefore(value: String?): Query
    fun endBefore(value: Boolean?, key: String = definedExternally): Query
    fun endBefore(value: Boolean?): Query
    fun equalTo(value: Number?, key: String = definedExternally): Query
    fun equalTo(value: Number?): Query
    fun equalTo(value: String?, key: String = definedExternally): Query
    fun equalTo(value: String?): Query
    fun equalTo(value: Boolean?, key: String = definedExternally): Query
    fun equalTo(value: Boolean?): Query
    fun isEqual(other: Query?): Boolean
    fun limitToFirst(limit: Number): Query
    fun limitToLast(limit: Number): Query
    fun off(eventType: String /* "value" | "child_added" | "child_changed" | "child_moved" | "child_removed" */ = definedExternally, callback: (a: DataSnapshot, b: String?) -> Any = definedExternally, context: Any? = definedExternally)
    fun get(): Promise<DataSnapshot>
    fun on(eventType: String /* "value" | "child_added" | "child_changed" | "child_moved" | "child_removed" */, callback: (a: DataSnapshot, b: String?) -> Any, cancelCallbackOrContext: ((a: Error) -> Any)? = definedExternally, context: Any? = definedExternally): (a: DataSnapshot?, b: String?) -> Any
    fun on(eventType: String /* "value" | "child_added" | "child_changed" | "child_moved" | "child_removed" */, callback: (a: DataSnapshot, b: String?) -> Any): (a: DataSnapshot?, b: String?) -> Any
    fun on(eventType: String /* "value" | "child_added" | "child_changed" | "child_moved" | "child_removed" */, callback: (a: DataSnapshot, b: String?) -> Any, cancelCallbackOrContext: ((a: Error) -> Any)? = definedExternally): (a: DataSnapshot?, b: String?) -> Any
    fun on(eventType: String /* "value" | "child_added" | "child_changed" | "child_moved" | "child_removed" */, callback: (a: DataSnapshot, b: String?) -> Any, cancelCallbackOrContext: Any? = definedExternally, context: Any? = definedExternally): (a: DataSnapshot?, b: String?) -> Any
    fun on(eventType: String /* "value" | "child_added" | "child_changed" | "child_moved" | "child_removed" */, callback: (a: DataSnapshot, b: String?) -> Any, cancelCallbackOrContext: Any? = definedExternally): (a: DataSnapshot?, b: String?) -> Any
    fun once(eventType: String /* "value" | "child_added" | "child_changed" | "child_moved" | "child_removed" */, successCallback: (a: DataSnapshot, b: String?) -> Any = definedExternally, failureCallbackOrContext: ((a: Error) -> Unit)? = definedExternally, context: Any? = definedExternally): Promise<DataSnapshot>
    fun once(eventType: String /* "value" | "child_added" | "child_changed" | "child_moved" | "child_removed" */): Promise<DataSnapshot>
    fun once(eventType: String /* "value" | "child_added" | "child_changed" | "child_moved" | "child_removed" */, successCallback: (a: DataSnapshot, b: String?) -> Any = definedExternally): Promise<DataSnapshot>
    fun once(eventType: String /* "value" | "child_added" | "child_changed" | "child_moved" | "child_removed" */, successCallback: (a: DataSnapshot, b: String?) -> Any = definedExternally, failureCallbackOrContext: ((a: Error) -> Unit)? = definedExternally): Promise<DataSnapshot>
    fun once(eventType: String /* "value" | "child_added" | "child_changed" | "child_moved" | "child_removed" */, successCallback: (a: DataSnapshot, b: String?) -> Any = definedExternally, failureCallbackOrContext: Any? = definedExternally, context: Any? = definedExternally): Promise<DataSnapshot>
    fun once(eventType: String /* "value" | "child_added" | "child_changed" | "child_moved" | "child_removed" */, successCallback: (a: DataSnapshot, b: String?) -> Any = definedExternally, failureCallbackOrContext: Any? = definedExternally): Promise<DataSnapshot>
    fun orderByChild(path: String): Query
    fun orderByKey(): Query
    fun orderByPriority(): Query
    fun orderByValue(): Query
    var ref: Reference
    fun startAt(value: Number?, key: String = definedExternally): Query
    fun startAt(value: Number?): Query
    fun startAt(value: String?, key: String = definedExternally): Query
    fun startAt(value: String?): Query
    fun startAt(value: Boolean?, key: String = definedExternally): Query
    fun startAt(value: Boolean?): Query
    fun startAfter(value: Number?, key: String = definedExternally): Query
    fun startAfter(value: Number?): Query
    fun startAfter(value: String?, key: String = definedExternally): Query
    fun startAfter(value: String?): Query
    fun startAfter(value: Boolean?, key: String = definedExternally): Query
    fun startAfter(value: Boolean?): Query
    fun toJSON(): Any
    override fun toString(): String
}

external interface Reference : Query {
    fun child(path: String): Reference
    var key: String?
    fun onDisconnect(): OnDisconnect
    var parent: Reference?
    fun push(value: Any = definedExternally, onComplete: (a: Error?) -> Any = definedExternally): ThenableReference
    fun remove(onComplete: (a: Error?) -> Any = definedExternally): Promise<Any>
    var root: Reference
    fun set(value: Any, onComplete: (a: Error?) -> Any = definedExternally): Promise<Any>
    fun setPriority(priority: String?, onComplete: (a: Error?) -> Any): Promise<Any>
    fun setPriority(priority: Number?, onComplete: (a: Error?) -> Any): Promise<Any>
    fun setWithPriority(newVal: Any, newPriority: String?, onComplete: (a: Error?) -> Any = definedExternally): Promise<Any>
    fun setWithPriority(newVal: Any, newPriority: String?): Promise<Any>
    fun setWithPriority(newVal: Any, newPriority: Number?, onComplete: (a: Error?) -> Any = definedExternally): Promise<Any>
    fun setWithPriority(newVal: Any, newPriority: Number?): Promise<Any>
    fun transaction(transactionUpdate: (a: Any) -> Any, onComplete: (a: Error?, b: Boolean, c: DataSnapshot?) -> Any = definedExternally, applyLocally: Boolean = definedExternally): Promise<Any>
    fun update(values: Any, onComplete: (a: Error?) -> Any = definedExternally): Promise<Any>
}

external interface ThenableReference : Reference, Pick<Promise<Reference>, String /* "then" | "catch" */>

external fun enableLogging(logger: Boolean = definedExternally, persistent: Boolean = definedExternally): Any

external fun enableLogging(): Any

external fun enableLogging(logger: Boolean = definedExternally): Any

external fun enableLogging(logger: (a: String) -> Any = definedExternally, persistent: Boolean = definedExternally): Any

external fun enableLogging(logger: (a: String) -> Any = definedExternally): Any