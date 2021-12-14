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
//import tsstdlib.Partial
import tsstdlib.ReadableStream
import tsstdlib.PromiseLike

external fun <T> addDoc(reference: CollectionReference<T>, data: T): Promise<DocumentReference<T>>

external fun <T> addDoc(reference: CollectionReference<T>, data: Any): Promise<DocumentReference<T>>

typealias AddPrefixToKeys<Prefix, T> = Any

external fun arrayRemove(vararg elements: Any): FieldValue

external fun arrayUnion(vararg elements: Any): FieldValue

external open class Bytes {
    open fun toBase64(): String
    open fun toUint8Array(): Uint8Array
    override fun toString(): String
    open fun isEqual(other: Bytes): Boolean

    companion object {
        fun fromBase64String(base64: String): Bytes
        fun fromUint8Array(array: Uint8Array): Bytes
    }
}

external var CACHE_SIZE_UNLIMITED: Any

typealias ChildUpdateFields<K, V> = Any

external fun clearIndexedDbPersistence(firestore: Firestore): Promise<Unit>

external fun collection(firestore: Firestore, path: String, vararg pathSegments: String): CollectionReference<DocumentData>

external fun collection(reference: CollectionReference<Any>, path: String, vararg pathSegments: String): CollectionReference<DocumentData>

external fun collection(reference: DocumentReference__0, path: String, vararg pathSegments: String): CollectionReference<DocumentData>

external fun collectionGroup(firestore: Firestore, collectionId: String): Query<DocumentData>

external open class CollectionReference<T> : Query<T> {
    override fun <U> withConverter(converter: FirestoreDataConverter<U>): CollectionReference<U>
    override fun withConverter(converter: Nothing?): CollectionReference<DocumentData>
}

external interface `T$0` {
    var mockUserToken: dynamic /* `T$11`? | `T$12`? | String? */
        get() = definedExternally
        set(value) = definedExternally
}

external fun connectFirestoreEmulator(firestore: Firestore, host: String, port: Number, options: `T$0` = definedExternally)

external fun deleteDoc(reference: DocumentReference<Any>): Promise<Unit>

external fun deleteField(): FieldValue

external fun disableNetwork(firestore: Firestore): Promise<Unit>

external fun doc(firestore: Firestore, path: String, vararg pathSegments: String): DocumentReference<DocumentData>

external fun <T> doc(reference: CollectionReference<T>, path: String = definedExternally, vararg pathSegments: String): DocumentReference<T>

external fun doc(reference: DocumentReference<Any>, path: String, vararg pathSegments: String): DocumentReference<DocumentData>

external interface DocumentChange<T> {
    var type: String /* "added" | "removed" | "modified" */
    var doc: QueryDocumentSnapshot<T>
    var oldIndex: Number
    var newIndex: Number
}

external interface DocumentData {
    @nativeGetter
    operator fun get(field: String): Any?
    @nativeSetter
    operator fun set(field: String, value: Any)
}

external fun documentId(): FieldPath

external open class DocumentReference<T> {
    open var converter: FirestoreDataConverter<T>?
    open var type: Any //= "document"
    open var firestore: Firestore
    open fun <U> withConverter(converter: FirestoreDataConverter<U>): DocumentReference<U>
    open fun withConverter(converter: Nothing?): DocumentReference<DocumentData>
}

external open class DocumentReference__0 : DocumentReference<DocumentData>

external open class DocumentSnapshot<T> {
    open var metadata: SnapshotMetadata
    open fun exists(): Boolean
    open fun data(options: SnapshotOptions = definedExternally): T?
    open fun get(fieldPath: String, options: SnapshotOptions = definedExternally): Any
    open fun get(fieldPath: String): Any
    open fun get(fieldPath: FieldPath, options: SnapshotOptions = definedExternally): Any
    open fun get(fieldPath: FieldPath): Any
}

external fun enableIndexedDbPersistence(firestore: Firestore, persistenceSettings: PersistenceSettings = definedExternally): Promise<Unit>

external fun enableMultiTabIndexedDbPersistence(firestore: Firestore): Promise<Unit>

external fun enableNetwork(firestore: Firestore): Promise<Unit>

external fun endAt(snapshot: DocumentSnapshot<Any>): QueryConstraint

external fun endAt(vararg fieldValues: Any): QueryConstraint

external fun endBefore(snapshot: DocumentSnapshot<Any>): QueryConstraint

external fun endBefore(vararg fieldValues: Any): QueryConstraint

external open class FieldPath(vararg fieldNames: String) {
    open fun isEqual(other: FieldPath): Boolean
}

external open class FieldValue {
    open fun isEqual(other: FieldValue): Boolean
}

external open class Firestore {
    open var type: String /* "firestore-lite" | "firestore" */
    open fun toJSON(): Any?
}

external interface FirestoreDataConverter<T> {
    fun toFirestore(modelObject: T): DocumentData
    fun toFirestore(modelObject: Any): DocumentData
//    fun toFirestore(modelObject: Partial, options: `T$6`): DocumentData
//    fun toFirestore(modelObject: Partial, options: `T$7`): DocumentData
    fun fromFirestore(snapshot: QueryDocumentSnapshot<DocumentData>, options: SnapshotOptions = definedExternally): T
}

typealias FirestoreError = Error

external interface FirestoreSettings {
    var cacheSizeBytes: Number?
        get() = definedExternally
        set(value) = definedExternally
    var experimentalForceLongPolling: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var experimentalAutoDetectLongPolling: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var host: String?
        get() = definedExternally
        set(value) = definedExternally
    var ssl: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var ignoreUndefinedProperties: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$1` {
    var latitude: Number
    var longitude: Number
}

external open class GeoPoint(latitude: Number, longitude: Number) {
    open fun isEqual(other: GeoPoint): Boolean
    open fun toJSON(): `T$1`
}

external fun <T> getDoc(reference: DocumentReference<T>): Promise<DocumentSnapshot<T>>

external fun <T> getDocFromCache(reference: DocumentReference<T>): Promise<DocumentSnapshot<T>>

external fun <T> getDocFromServer(reference: DocumentReference<T>): Promise<DocumentSnapshot<T>>

external fun <T> getDocs(query: Query<T>): Promise<QuerySnapshot<T>>

external fun <T> getDocsFromCache(query: Query<T>): Promise<QuerySnapshot<T>>

external fun <T> getDocsFromServer(query: Query<T>): Promise<QuerySnapshot<T>>

external fun getFirestore(app: FirebaseApp = definedExternally): Firestore

external fun increment(n: Number): FieldValue

external fun initializeFirestore(app: FirebaseApp, settings: FirestoreSettings): Firestore

external fun limit(limit: Number): QueryConstraint

external fun limitToLast(limit: Number): QueryConstraint

//external fun loadBundle(firestore: Firestore, bundleData: ReadableStream<Uint8Array>): LoadBundleTask
//
//external fun loadBundle(firestore: Firestore, bundleData: ArrayBuffer): LoadBundleTask
//
//external fun loadBundle(firestore: Firestore, bundleData: String): LoadBundleTask

//external open class LoadBundleTask : PromiseLike<LoadBundleTaskProgress> {
//    open fun onProgress(next: (progress: LoadBundleTaskProgress) -> Any = definedExternally, error: (err: Error) -> Any = definedExternally, complete: () -> Unit = definedExternally)
//    open fun catch(onRejected: (a: Error) -> Any?): Promise<dynamic /* R | LoadBundleTaskProgress */>
//    open fun then(onFulfilled: (a: LoadBundleTaskProgress) -> Any? = definedExternally, onRejected: (a: Error) -> Any? = definedExternally): Promise<dynamic /* T | R */>
//}

external interface LoadBundleTaskProgress {
    var documentsLoaded: Number
    var totalDocuments: Number
    var bytesLoaded: Number
    var totalBytes: Number
    var taskState: String /* "Error" | "Running" | "Success" */
}

external fun namedQuery(firestore: Firestore, name: String): Promise<Query__0?>

typealias NestedUpdateFields<T> = UnionToIntersection<Any>

external interface `T$2`<T> {
    var next: ((snapshot: DocumentSnapshot<T>) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var error: ((error: FirestoreError) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var complete: (() -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
}

external fun <T> onSnapshot(reference: DocumentReference<T>, observer: `T$2`<T>): Unsubscribe

external fun <T> onSnapshot(reference: DocumentReference<T>, options: SnapshotListenOptions, observer: `T$2`<T>): Unsubscribe

external fun <T> onSnapshot(reference: DocumentReference<T>, onNext: (snapshot: DocumentSnapshot<T>) -> Unit, onError: (error: FirestoreError) -> Unit = definedExternally, onCompletion: () -> Unit = definedExternally): Unsubscribe

external fun <T> onSnapshot(reference: DocumentReference<T>, onNext: (snapshot: DocumentSnapshot<T>) -> Unit): Unsubscribe

external fun <T> onSnapshot(reference: DocumentReference<T>, onNext: (snapshot: DocumentSnapshot<T>) -> Unit, onError: (error: FirestoreError) -> Unit = definedExternally): Unsubscribe

external fun <T> onSnapshot(reference: DocumentReference<T>, options: SnapshotListenOptions, onNext: (snapshot: DocumentSnapshot<T>) -> Unit, onError: (error: FirestoreError) -> Unit = definedExternally, onCompletion: () -> Unit = definedExternally): Unsubscribe

external fun <T> onSnapshot(reference: DocumentReference<T>, options: SnapshotListenOptions, onNext: (snapshot: DocumentSnapshot<T>) -> Unit): Unsubscribe

external fun <T> onSnapshot(reference: DocumentReference<T>, options: SnapshotListenOptions, onNext: (snapshot: DocumentSnapshot<T>) -> Unit, onError: (error: FirestoreError) -> Unit = definedExternally): Unsubscribe

external interface `T$3`<T> {
    var next: ((snapshot: QuerySnapshot<T>) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var error: ((error: FirestoreError) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var complete: (() -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
}

external fun <T> onSnapshot(query: Query<T>, observer: `T$3`<T>): Unsubscribe

external fun <T> onSnapshot(query: Query<T>, options: SnapshotListenOptions, observer: `T$3`<T>): Unsubscribe

external fun <T> onSnapshot(query: Query<T>, onNext: (snapshot: QuerySnapshot<T>) -> Unit, onError: (error: FirestoreError) -> Unit = definedExternally, onCompletion: () -> Unit = definedExternally): Unsubscribe

external fun <T> onSnapshot(query: Query<T>, onNext: (snapshot: QuerySnapshot<T>) -> Unit): Unsubscribe

external fun <T> onSnapshot(query: Query<T>, onNext: (snapshot: QuerySnapshot<T>) -> Unit, onError: (error: FirestoreError) -> Unit = definedExternally): Unsubscribe

external fun <T> onSnapshot(query: Query<T>, options: SnapshotListenOptions, onNext: (snapshot: QuerySnapshot<T>) -> Unit, onError: (error: FirestoreError) -> Unit = definedExternally, onCompletion: () -> Unit = definedExternally): Unsubscribe

external fun <T> onSnapshot(query: Query<T>, options: SnapshotListenOptions, onNext: (snapshot: QuerySnapshot<T>) -> Unit): Unsubscribe

external fun <T> onSnapshot(query: Query<T>, options: SnapshotListenOptions, onNext: (snapshot: QuerySnapshot<T>) -> Unit, onError: (error: FirestoreError) -> Unit = definedExternally): Unsubscribe

external interface `T$4` {
    var next: ((value: Unit) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var error: ((error: FirestoreError) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var complete: (() -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
}

external fun onSnapshotsInSync(firestore: Firestore, observer: `T$4`): Unsubscribe

external fun onSnapshotsInSync(firestore: Firestore, onSync: () -> Unit): Unsubscribe

external fun orderBy(fieldPath: String, directionStr: String /* "desc" | "asc" */ = definedExternally): QueryConstraint

external fun orderBy(fieldPath: String): QueryConstraint

external fun orderBy(fieldPath: FieldPath, directionStr: String /* "desc" | "asc" */ = definedExternally): QueryConstraint

external fun orderBy(fieldPath: FieldPath): QueryConstraint

external interface PersistenceSettings {
    var forceOwnership: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external open class Query<T> {
    open var converter: FirestoreDataConverter<T>?
    open var type: String /* "query" | "collection" */
    open var firestore: Firestore
    open fun withConverter(converter: Nothing?): Query<DocumentData>
    open fun <U> withConverter(converter: FirestoreDataConverter<U>): Query<U>
}

external open class Query__0 : Query<DocumentData>

external fun <T> query(query: Query<T>, vararg queryConstraints: QueryConstraint): Query<T>

external open class QueryConstraint {
    open var type: String /* "where" | "orderBy" | "limit" | "limitToLast" | "startAt" | "startAfter" | "endAt" | "endBefore" */
}

external open class QueryDocumentSnapshot<T> : DocumentSnapshot<T> {
    override fun data(options: SnapshotOptions): T
}

external fun <T> queryEqual(left: Query<T>, right: Query<T>): Boolean

external open class QuerySnapshot<T> {
    open var metadata: SnapshotMetadata
    open var query: Query<T>
    open fun forEach(callback: (result: QueryDocumentSnapshot<T>) -> Unit, thisArg: Any = definedExternally)
    open fun docChanges(options: SnapshotListenOptions = definedExternally): Array<DocumentChange<T>>
}

external fun <T> refEqual(left: DocumentReference<T>, right: DocumentReference<T>): Boolean

external fun <T> refEqual(left: DocumentReference<T>, right: CollectionReference<T>): Boolean

external fun <T> refEqual(left: CollectionReference<T>, right: DocumentReference<T>): Boolean

external fun <T> refEqual(left: CollectionReference<T>, right: CollectionReference<T>): Boolean

external fun <T> runTransaction(firestore: Firestore, updateFunction: (transaction: Transaction) -> Promise<T>): Promise<T>

external fun serverTimestamp(): FieldValue

external fun <T> setDoc(reference: DocumentReference<T>, data: T): Promise<Unit>

external fun <T> setDoc(reference: DocumentReference<T>, data: Any): Promise<Unit>

//external fun <T> setDoc(reference: DocumentReference<T>, data: Partial, options: `T$6`): Promise<Unit>

//external fun <T> setDoc(reference: DocumentReference<T>, data: Partial, options: `T$7`): Promise<Unit>

external fun setLogLevel(logLevel: String /* "debug" | "verbose" | "info" | "warn" | "error" | "silent" */)

external interface `T$6` {
    var merge: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$7` {
    var mergeFields: Array<dynamic /* String | FieldPath */>?
        get() = definedExternally
        set(value) = definedExternally
}

external fun <T> snapshotEqual(left: DocumentSnapshot<T>, right: DocumentSnapshot<T>): Boolean

external fun <T> snapshotEqual(left: DocumentSnapshot<T>, right: QuerySnapshot<T>): Boolean

external fun <T> snapshotEqual(left: QuerySnapshot<T>, right: DocumentSnapshot<T>): Boolean

external fun <T> snapshotEqual(left: QuerySnapshot<T>, right: QuerySnapshot<T>): Boolean

external interface SnapshotListenOptions {
    var includeMetadataChanges: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external open class SnapshotMetadata {
    open var hasPendingWrites: Boolean
    open var fromCache: Boolean
    open fun isEqual(other: SnapshotMetadata): Boolean
}

external interface SnapshotOptions {
    var serverTimestamps: String? /* "estimate" | "previous" | "none" */
        get() = definedExternally
        set(value) = definedExternally
}

external fun startAfter(snapshot: DocumentSnapshot<Any>): QueryConstraint

external fun startAfter(vararg fieldValues: Any): QueryConstraint

external fun startAt(snapshot: DocumentSnapshot<Any>): QueryConstraint

external fun startAt(vararg fieldValues: Any): QueryConstraint

external fun terminate(firestore: Firestore): Promise<Unit>

external interface `T$5` {
    var seconds: Number
    var nanoseconds: Number
}

external open class Timestamp(seconds: Number, nanoseconds: Number) {
    open var seconds: Number
    open var nanoseconds: Number
    open fun toDate(): Date
    open fun toMillis(): Number
    open fun isEqual(other: Timestamp): Boolean
    override fun toString(): String
    open fun toJSON(): `T$5`
    open fun valueOf(): String

    companion object {
        fun now(): Timestamp
        fun fromDate(date: Date): Timestamp
        fun fromMillis(milliseconds: Number): Timestamp
    }
}

external open class Transaction {
    open fun <T> get(documentRef: DocumentReference<T>): Promise<DocumentSnapshot<T>>
    open fun <T> set(documentRef: DocumentReference<T>, data: T): Transaction /* this */
    open fun <T> set(documentRef: DocumentReference<T>, data: Any): Transaction /* this */
//    open fun <T> set(documentRef: DocumentReference<T>, data: Partial, options: `T$6`): Transaction /* this */
//    open fun <T> set(documentRef: DocumentReference<T>, data: Partial, options: `T$7`): Transaction /* this */
    open fun <T> update(documentRef: DocumentReference<T>, data: UpdateData<T>): Transaction /* this */
    open fun update(documentRef: DocumentReference<Any>, field: String, value: Any, vararg moreFieldsAndValues: Any): Transaction /* this */
    open fun update(documentRef: DocumentReference<Any>, field: FieldPath, value: Any, vararg moreFieldsAndValues: Any): Transaction /* this */
    open fun delete(documentRef: DocumentReference<Any>): Transaction /* this */
}

typealias UnionToIntersection<U> = Any

external interface Unsubscribe {
    @nativeInvoke
    operator fun invoke()
}

typealias UpdateData<T> = Any

external fun <T> updateDoc(reference: DocumentReference<T>, data: UpdateData<T>): Promise<Unit>

external fun updateDoc(reference: DocumentReference<Any>, field: String, value: Any, vararg moreFieldsAndValues: Any): Promise<Unit>

external fun updateDoc(reference: DocumentReference<Any>, field: FieldPath, value: Any, vararg moreFieldsAndValues: Any): Promise<Unit>

external fun waitForPendingWrites(firestore: Firestore): Promise<Unit>

external fun where(fieldPath: String, opStr: String /* "<" | "<=" | "==" | "!=" | ">=" | ">" | "array-contains" | "in" | "array-contains-any" | "not-in" */, value: Any): QueryConstraint

external fun where(fieldPath: FieldPath, opStr: String /* "<" | "<=" | "==" | "!=" | ">=" | ">" | "array-contains" | "in" | "array-contains-any" | "not-in" */, value: Any): QueryConstraint

external open class WriteBatch {
    open fun <T> set(documentRef: DocumentReference<T>, data: T): WriteBatch
    open fun <T> set(documentRef: DocumentReference<T>, data: Any): WriteBatch
//    open fun <T> set(documentRef: DocumentReference<T>, data: Partial, options: `T$6`): WriteBatch
//    open fun <T> set(documentRef: DocumentReference<T>, data: Partial, options: `T$7`): WriteBatch
    open fun <T> update(documentRef: DocumentReference<T>, data: UpdateData<T>): WriteBatch
    open fun update(documentRef: DocumentReference<Any>, field: String, value: Any, vararg moreFieldsAndValues: Any): WriteBatch
    open fun update(documentRef: DocumentReference<Any>, field: FieldPath, value: Any, vararg moreFieldsAndValues: Any): WriteBatch
    open fun delete(documentRef: DocumentReference<Any>): WriteBatch
    open fun commit(): Promise<Unit>
}

external fun writeBatch(firestore: Firestore): WriteBatch