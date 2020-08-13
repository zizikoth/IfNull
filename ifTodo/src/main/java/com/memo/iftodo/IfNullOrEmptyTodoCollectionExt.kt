package com.memo.iftodo

inline fun <T> Collection<T>?.ifNullOrEmpty(ifNullOrEmpty: (Collection<T>?) -> Unit, ifNotNullOrEmpty: (Collection<T>) -> Unit) {
	if (null == this || this.isEmpty()) ifNullOrEmpty.invoke(this) else ifNotNullOrEmpty.invoke(this)
}

inline fun <T> Collection<T>?.ifNullOrEmpty(ifNullOrEmpty: (Collection<T>?) -> Unit) {
	this.ifNullOrEmpty(ifNullOrEmpty, {})
}

inline fun <T> Collection<T>?.ifNotNullOrEmpty(ifNotNullOrEmpty: (Collection<T>) -> Unit) {
	this.ifNullOrEmpty({}, ifNotNullOrEmpty)
}

inline fun <K, V> Map<K, V>?.ifNullOrEmpty(ifNullOrEmpty: (Map<K, V>?) -> Unit , ifNotNullOrEmpty: (Map<K, V>) -> Unit ) {
	if (null == this || this.isEmpty()) ifNullOrEmpty.invoke(this) else ifNotNullOrEmpty.invoke(this)
}

inline fun <K, V> Map<K, V>?.ifNullOrEmpty(ifNullOrEmpty: (Map<K, V>?) -> Unit) {
	this.ifNullOrEmpty(ifNullOrEmpty, {})
}

inline fun <K, V> Map<K, V>?.ifNotNullOrEmpty(ifNotNullOrEmpty: (Map<K, V>) -> Unit) {
	this.ifNullOrEmpty({}, ifNotNullOrEmpty)
}

inline fun <T> Set<T>?.ifNullOrEmpty(ifNullOrEmpty: (Set<T>?) -> Unit , ifNotNullOrEmpty: (Set<T>) -> Unit ) {
	if (null == this || this.isEmpty()) ifNullOrEmpty.invoke(this) else ifNotNullOrEmpty.invoke(this)
}

inline fun <T> Set<T>?.ifNullOrEmpty(ifNullOrEmpty: (Set<T>?) -> Unit) {
	this.ifNullOrEmpty(ifNullOrEmpty, {})
}

inline fun <T> Set<T>?.ifNotNullOrEmpty(ifNotNullOrEmpty: (Set<T>) -> Unit) {
	this.ifNullOrEmpty({}, ifNotNullOrEmpty)
}
