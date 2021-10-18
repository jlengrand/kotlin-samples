@file:JsQualifier("messaging")
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")

import kotlin.js.*
import org.w3c.workers.*

external interface `T$37` {
    var vapidKey: String?
        get() = definedExternally
        set(value) = definedExternally
    var serviceWorkerRegistration: ServiceWorkerRegistration?
        get() = definedExternally
        set(value) = definedExternally
}

external interface Messaging {
    fun deleteToken(): Promise<Boolean>
    fun getToken(options: `T$37` = definedExternally): Promise<String>
    fun onMessage(nextOrObserver: NextFn<Any>): Unsubscribe
    fun onMessage(nextOrObserver: Observer__1<Any>): Unsubscribe
    fun onBackgroundMessage(nextOrObserver: NextFn<MessagePayload>): Unsubscribe
    fun onBackgroundMessage(nextOrObserver: Observer__1<MessagePayload>): Unsubscribe
}

external interface MessagePayload {
    var notification: NotificationPayload?
        get() = definedExternally
        set(value) = definedExternally
    var data: `T$9`?
        get() = definedExternally
        set(value) = definedExternally
    var fcmOptions: FcmOptions?
        get() = definedExternally
        set(value) = definedExternally
    var from: String
    var collapseKey: String
}

external interface FcmOptions {
    var link: String?
        get() = definedExternally
        set(value) = definedExternally
    var analyticsLabel: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface NotificationPayload {
    var title: String?
        get() = definedExternally
        set(value) = definedExternally
    var body: String?
        get() = definedExternally
        set(value) = definedExternally
    var image: String?
        get() = definedExternally
        set(value) = definedExternally
}

external fun isSupported(): Boolean