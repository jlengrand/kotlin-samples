@file:JsQualifier("firebase")
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")

import kotlin.js.*

external interface FirebaseError {
    var code: String
    var message: String
    var name: String /* "FirebaseError" */
    var stack: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface Observer<T, E> {
    var next: NextFn<T>
    var error: ErrorFn<E>
    var complete: CompleteFn
}

external interface Observer__1<T> : Observer<T, Error>

external var SDK_VERSION: String

external fun registerVersion(library: String, version: String, variant: String = definedExternally)

external fun setLogLevel(logLevel: String /* "debug" | "verbose" | "info" | "warn" | "error" | "silent" */)

external interface `T$0` {
    var level: String /* "debug" | "verbose" | "info" | "warn" | "error" | "silent" */
    var message: String
    var args: Array<Any>
    var type: String
}

external interface `T$1` {
    var level: String /* "debug" | "verbose" | "info" | "warn" | "error" | "silent" */
}

external fun onLog(logCallback: (callbackParams: `T$0`) -> Unit, options: `T$1` = definedExternally)

external interface `T$2` {
    var displayName: String?
        get() = definedExternally
        set(value) = definedExternally
    var photoURL: String?
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
external interface User : UserInfo {
    fun delete(): Promise<Unit>
    var emailVerified: Boolean
    fun getIdTokenResult(forceRefresh: Boolean = definedExternally): Promise<IdTokenResult>
    fun getIdToken(forceRefresh: Boolean = definedExternally): Promise<String>
    var isAnonymous: Boolean
    fun linkAndRetrieveDataWithCredential(credential: AuthCredential): Promise<UserCredential>
    fun linkWithCredential(credential: AuthCredential): Promise<UserCredential>
    fun linkWithPhoneNumber(phoneNumber: String, applicationVerifier: ApplicationVerifier): Promise<ConfirmationResult>
    fun linkWithPopup(provider: AuthProvider): Promise<UserCredential>
    fun linkWithRedirect(provider: AuthProvider): Promise<Unit>
    var metadata: UserMetadata
    var multiFactor: MultiFactorUser
    override var phoneNumber: String?
    var providerData: Array<UserInfo?>
    fun reauthenticateAndRetrieveDataWithCredential(credential: AuthCredential): Promise<UserCredential>
    fun reauthenticateWithCredential(credential: AuthCredential): Promise<UserCredential>
    fun reauthenticateWithPhoneNumber(phoneNumber: String, applicationVerifier: ApplicationVerifier): Promise<ConfirmationResult>
    fun reauthenticateWithPopup(provider: AuthProvider): Promise<UserCredential>
    fun reauthenticateWithRedirect(provider: AuthProvider): Promise<Unit>
    var refreshToken: String
    fun reload(): Promise<Unit>
    fun sendEmailVerification(actionCodeSettings: ActionCodeSettings? = definedExternally): Promise<Unit>
    var tenantId: String?
    fun toJSON(): Any
    fun unlink(providerId: String): Promise<User>
    fun updateEmail(newEmail: String): Promise<Unit>
    fun updatePassword(newPassword: String): Promise<Unit>
    fun updatePhoneNumber(phoneCredential: AuthCredential): Promise<Unit>
    fun updateProfile(profile: `T$2`): Promise<Unit>
    fun verifyBeforeUpdateEmail(newEmail: String, actionCodeSettings: ActionCodeSettings? = definedExternally): Promise<Unit>
    interface MultiFactorUser {
        var enrolledFactors: Array<MultiFactorInfo>
        fun enroll(assertion: MultiFactorAssertion, displayName: String? = definedExternally): Promise<Unit>
        fun getSession(): Promise<MultiFactorSession>
        fun unenroll(option: MultiFactorInfo): Promise<Unit>
        fun unenroll(option: String): Promise<Unit>
    }
}

external interface UserInfo {
    var displayName: String?
    var email: String?
    var phoneNumber: String?
    var photoURL: String?
    var providerId: String
    var uid: String
}

external interface `T$3` {
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
    var firebase: `T$3`
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
    var firebase: `T$3`?
        get() = definedExternally
        set(value) = definedExternally
    var uid: Any?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$4` {
    var user_id: String
}

external interface `T$5` {
    var sub: String
}

external fun app(name: String = definedExternally): App

external var apps: Array<App>

external fun auth(app: App = definedExternally): Auth

external fun database(app: App = definedExternally): Database

external fun initializeApp(options: Any, name: String = definedExternally): App

external fun messaging(app: App = definedExternally): Messaging

external fun functions(app: App = definedExternally): Functions

external fun performance(app: App = definedExternally): Performance

external fun remoteConfig(app: App = definedExternally): RemoteConfig

external fun analytics(app: App = definedExternally): Analytics

external fun appCheck(app: App = definedExternally): AppCheck