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
import tsstdlib.Map

external fun <T : Nothing?> _addComponent(app: FirebaseApp, component: Component<T>)

external fun _addOrOverwriteComponent(app: FirebaseApp, component: Component__0)

external var _apps: Map<String, FirebaseApp>

external fun _clearComponents()

//external var _components: Map<String, Component<Any>>

external var _DEFAULT_ENTRY_NAME: Any

external fun deleteApp(app: FirebaseApp): Promise<Unit>

external interface FirebaseApp {
    var name: String
    var options: FirebaseOptions
    var automaticDataCollectionEnabled: Boolean
}

external interface _FirebaseAppInternal : FirebaseApp {
    var container: ComponentContainer
    var isDeleted: Boolean
    fun checkDestroyed()
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

external interface _FirebaseService {
    var app: FirebaseApp
    fun _delete(): Promise<Unit>
}

external fun getApp(name: String = definedExternally): FirebaseApp

external fun getApps(): Array<FirebaseApp>

external fun <T : Nothing?> _getProvider(app: FirebaseApp, name: T): Provider<T>

external fun initializeApp(options: FirebaseOptions, name: String = definedExternally): FirebaseApp

external fun initializeApp(options: FirebaseOptions): FirebaseApp

external fun initializeApp(options: FirebaseOptions, config: FirebaseAppSettings = definedExternally): FirebaseApp

external fun onLog(logCallback: LogCallback?, options: LogOptions = definedExternally)

external fun <T : Nothing?> _registerComponent(component: Component<T>): Boolean

external fun registerVersion(libraryKeyOrName: String, version: String, variant: String = definedExternally)

external fun <T : Nothing?> _removeServiceInstance(app: FirebaseApp, name: T, instanceIdentifier: String = definedExternally)

external var SDK_VERSION: String

external fun setLogLevel(logLevel: String /* "debug" | "verbose" | "info" | "warn" | "error" | "silent" */)