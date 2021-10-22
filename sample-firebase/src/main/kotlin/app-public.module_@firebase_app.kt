@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")

@file:JsModule("firebase")
@file:JsNonModule
@file:JsQualifier("app")
import kotlin.js.*

external fun deleteApp(app: FirebaseApp): Promise<Unit>

external interface FirebaseApp {
    var name: String
    var options: FirebaseOptions
    var automaticDataCollectionEnabled: Boolean
}

external interface FirebaseAppSettings {
    var name: String?
        get() = definedExternally
        set(value) = definedExternally
    var automaticDataCollectionEnabled: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface FirebaseOptions {
    var apiKey: String?
        get() = definedExternally
        set(value) = definedExternally
    var authDomain: String?
        get() = definedExternally
        set(value) = definedExternally
    var databaseURL: String?
        get() = definedExternally
        set(value) = definedExternally
    var projectId: String?
        get() = definedExternally
        set(value) = definedExternally
    var storageBucket: String?
        get() = definedExternally
        set(value) = definedExternally
    var messagingSenderId: String?
        get() = definedExternally
        set(value) = definedExternally
    var appId: String?
        get() = definedExternally
        set(value) = definedExternally
    var measurementId: String?
        get() = definedExternally
        set(value) = definedExternally
}

external fun getApp(name: String = definedExternally): FirebaseApp

external fun getApps(): Array<FirebaseApp>

external fun initializeApp(options: FirebaseOptions, name: String = definedExternally): FirebaseApp

external fun initializeApp(options: FirebaseOptions): FirebaseApp

external fun initializeApp(options: FirebaseOptions, config: FirebaseAppSettings = definedExternally): FirebaseApp

external fun onLog(logCallback: LogCallback?, options: LogOptions = definedExternally)

external fun registerVersion(libraryKeyOrName: String, version: String, variant: String = definedExternally)

external var SDK_VERSION: String

external fun setLogLevel(logLevel: String /* "debug" | "verbose" | "info" | "warn" | "error" | "silent" */)