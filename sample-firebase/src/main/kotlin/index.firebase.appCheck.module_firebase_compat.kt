@file:JsQualifier("appCheck")
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")

import kotlin.js.*

external interface AppCheckTokenResult {
    var token: String
}

external open class ReCaptchaV3Provider(siteKey: String)

external open class CustomProvider(options: CustomProviderOptions)

external interface CustomProviderOptions {
    var getToken: () -> Promise<AppCheckToken>
}

external interface `T$6` {
    var getToken: () -> AppCheckToken
}

external interface `T$7` {
    var next: (tokenResult: AppCheckTokenResult) -> Unit
    var error: ((error: Error) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var complete: (() -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
}

external interface AppCheck {
    fun activate(provider: ReCaptchaV3Provider, isTokenAutoRefreshEnabled: Boolean = definedExternally)
    fun activate(provider: ReCaptchaV3Provider)
    fun activate(provider: CustomProvider, isTokenAutoRefreshEnabled: Boolean = definedExternally)
    fun activate(provider: CustomProvider)
    fun activate(provider: AppCheckProvider, isTokenAutoRefreshEnabled: Boolean = definedExternally)
    fun activate(provider: AppCheckProvider)
    fun activate(provider: `T$6`, isTokenAutoRefreshEnabled: Boolean = definedExternally)
    fun activate(provider: `T$6`)
    fun activate(provider: String, isTokenAutoRefreshEnabled: Boolean = definedExternally)
    fun activate(provider: String)
    fun setTokenAutoRefreshEnabled(isTokenAutoRefreshEnabled: Boolean)
    fun getToken(forceRefresh: Boolean = definedExternally): Promise<AppCheckTokenResult>
    fun onTokenChanged(observer: `T$7`): Unsubscribe
    fun onTokenChanged(onNext: (tokenResult: AppCheckTokenResult) -> Unit, onError: (error: Error) -> Unit = definedExternally, onCompletion: () -> Unit = definedExternally): Unsubscribe
    fun onTokenChanged(onNext: (tokenResult: AppCheckTokenResult) -> Unit): Unsubscribe
    fun onTokenChanged(onNext: (tokenResult: AppCheckTokenResult) -> Unit, onError: (error: Error) -> Unit = definedExternally): Unsubscribe
}

external interface AppCheckProvider {
    fun getToken(): Promise<AppCheckToken>
}

external interface AppCheckToken {
    var token: String
    var expireTimeMillis: Number
}