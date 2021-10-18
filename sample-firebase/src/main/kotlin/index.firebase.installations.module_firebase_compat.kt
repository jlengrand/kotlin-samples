@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")

import kotlin.js.*
import App

external interface Installations {
    var app: App
    fun getId(): Promise<String>
    fun getToken(forceRefresh: Boolean = definedExternally): Promise<String>
    fun delete(): Promise<Unit>
    fun onIdChange(callback: (installationId: String) -> Unit): () -> Unit
}