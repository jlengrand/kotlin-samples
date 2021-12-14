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

//external interface FirebaseApp {
//    var name: String
//    var options: FirebaseOptions
//    var automaticDataCollectionEnabled: Boolean
//}

//external interface FirebaseOptions {
//    var apiKey: String?
//        get() = definedExternally
//        set(value) = definedExternally
//    var authDomain: String?
//        get() = definedExternally
//        set(value) = definedExternally
//    var databaseURL: String?
//        get() = definedExternally
//        set(value) = definedExternally
//    var projectId: String?
//        get() = definedExternally
//        set(value) = definedExternally
//    var storageBucket: String?
//        get() = definedExternally
//        set(value) = definedExternally
//    var messagingSenderId: String?
//        get() = definedExternally
//        set(value) = definedExternally
//    var appId: String?
//        get() = definedExternally
//        set(value) = definedExternally
//    var measurementId: String?
//        get() = definedExternally
//        set(value) = definedExternally
//}