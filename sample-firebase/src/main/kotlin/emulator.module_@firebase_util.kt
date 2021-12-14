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

external interface `T$10` {
    var sign_in_provider: String /* "custom" | "email" | "password" | "phone" | "anonymous" | "google.com" | "facebook.com" | "github.com" | "twitter.com" | "microsoft.com" | "apple.com" */
    var identities: Any?
        get() = definedExternally
        set(value) = definedExternally
}

external interface FirebaseIdToken {
    var iss: String
    var aud: String
    var sub: String
    var iat: Number
    var exp: Number
    var user_id: String
    var auth_time: Number
    var provider_id: String? /* "anonymous" */
        get() = definedExternally
        set(value) = definedExternally
    var email: String?
        get() = definedExternally
        set(value) = definedExternally
    var email_verified: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var phone_number: String?
        get() = definedExternally
        set(value) = definedExternally
    var name: String?
        get() = definedExternally
        set(value) = definedExternally
    var picture: String?
        get() = definedExternally
        set(value) = definedExternally
    var firebase: `T$10`
    @nativeGetter
    operator fun get(claim: String): Any?
    @nativeSetter
    operator fun set(claim: String, value: Any)
    var uid: Any?
        get() = definedExternally
        set(value) = definedExternally
}

external interface FirebaseIdTokenPartial {
    var iss: String?
        get() = definedExternally
        set(value) = definedExternally
    var aud: String?
        get() = definedExternally
        set(value) = definedExternally
    var sub: String?
        get() = definedExternally
        set(value) = definedExternally
    var iat: Number?
        get() = definedExternally
        set(value) = definedExternally
    var exp: Number?
        get() = definedExternally
        set(value) = definedExternally
    var user_id: String?
        get() = definedExternally
        set(value) = definedExternally
    var auth_time: Number?
        get() = definedExternally
        set(value) = definedExternally
    var provider_id: String? /* "anonymous" */
        get() = definedExternally
        set(value) = definedExternally
    var email: String?
        get() = definedExternally
        set(value) = definedExternally
    var email_verified: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var phone_number: String?
        get() = definedExternally
        set(value) = definedExternally
    var name: String?
        get() = definedExternally
        set(value) = definedExternally
    var picture: String?
        get() = definedExternally
        set(value) = definedExternally
    var firebase: `T$10`?
        get() = definedExternally
        set(value) = definedExternally
    var uid: Any?
        get() = definedExternally
        set(value) = definedExternally
}