package com.memo.iftodo

inline fun <T> Array<out T>?.ifNullOrEmpty(ifNullOrEmpty: (Array<out T>?) -> Unit, ifNotNullOrEmpty: (Array<out T>) -> Unit) {
	if (this.isNullOrEmpty()) ifNullOrEmpty.invoke(this) else ifNotNullOrEmpty.invoke(this)
}

inline fun <T> Array<out T>?.ifNullOrEmpty(ifNullOrEmpty: (Array<out T>?) -> Unit) {
	this.ifNullOrEmpty(ifNullOrEmpty, {})
}

inline fun <T> Array<out T>?.ifNotNullOrEmpty(ifNotNullOrEmpty: (Array<out T>) -> Unit) {
	this.ifNullOrEmpty({}, ifNotNullOrEmpty)
}

inline fun IntArray?.ifNullOrEmpty(ifNullOrEmpty: (IntArray?) -> Unit, ifNotNullOrEmpty: (IntArray) -> Unit) {
	if (null == this || this.isEmpty()) ifNullOrEmpty.invoke(this) else ifNotNullOrEmpty.invoke(this)
}

inline fun IntArray?.ifNullOrEmpty(ifNullOrEmpty: (IntArray?) -> Unit) {
	this.ifNullOrEmpty(ifNullOrEmpty, {})
}

inline fun IntArray?.ifNotNullOrEmpty(ifNotNullOrEmpty: (IntArray) -> Unit) {
	this.ifNullOrEmpty({}, ifNotNullOrEmpty)
}

inline fun DoubleArray?.ifNullOrEmpty(ifNullOrEmpty: (DoubleArray?) -> Unit, ifNotNullOrEmpty: (DoubleArray) -> Unit) {
	if (null == this || this.isEmpty()) ifNullOrEmpty.invoke(this) else ifNotNullOrEmpty.invoke(this)
}

inline fun DoubleArray?.ifNullOrEmpty(ifNullOrEmpty: (DoubleArray?) -> Unit) {
	this.ifNullOrEmpty(ifNullOrEmpty, {})
}

inline fun DoubleArray?.ifNotNullOrEmpty(ifNotNullOrEmpty: (DoubleArray) -> Unit) {
	this.ifNullOrEmpty({}, ifNotNullOrEmpty)
}

inline fun FloatArray?.ifNullOrEmpty(ifNullOrEmpty: (FloatArray?) -> Unit, ifNotNullOrEmpty: (FloatArray) -> Unit) {
	if (null == this || this.isEmpty()) ifNullOrEmpty.invoke(this) else ifNotNullOrEmpty.invoke(this)
}

inline fun FloatArray?.ifNullOrEmpty(ifNullOrEmpty: (FloatArray?) -> Unit) {
	this.ifNullOrEmpty(ifNullOrEmpty, {})
}

inline fun FloatArray?.ifNotNullOrEmpty(ifNotNullOrEmpty: (FloatArray) -> Unit) {
	this.ifNullOrEmpty({}, ifNotNullOrEmpty)
}

inline fun LongArray?.ifNullOrEmpty(ifNullOrEmpty: (LongArray?) -> Unit, ifNotNullOrEmpty: (LongArray) -> Unit) {
	if (null == this || this.isEmpty()) ifNullOrEmpty.invoke(this) else ifNotNullOrEmpty.invoke(this)
}

inline fun LongArray?.ifNullOrEmpty(ifNullOrEmpty: (LongArray?) -> Unit) {
	this.ifNullOrEmpty(ifNullOrEmpty, {})
}

inline fun LongArray?.ifNotNullOrEmpty(ifNotNullOrEmpty: (LongArray) -> Unit) {
	this.ifNullOrEmpty({}, ifNotNullOrEmpty)
}

inline fun ShortArray?.ifNullOrEmpty(ifNullOrEmpty: (ShortArray?) -> Unit, ifNotNullOrEmpty: (ShortArray) -> Unit) {
	if (null == this || this.isEmpty()) ifNullOrEmpty.invoke(this) else ifNotNullOrEmpty.invoke(this)
}

inline fun ShortArray?.ifNullOrEmpty(ifNullOrEmpty: (ShortArray?) -> Unit) {
	this.ifNullOrEmpty(ifNullOrEmpty, {})
}

inline fun ShortArray?.ifNotNullOrEmpty(ifNotNullOrEmpty: (ShortArray) -> Unit) {
	this.ifNullOrEmpty({}, ifNotNullOrEmpty)
}

inline fun BooleanArray?.ifNullOrEmpty(ifNullOrEmpty: (BooleanArray?) -> Unit, ifNotNullOrEmpty: (BooleanArray) -> Unit) {
	if (null == this || this.isEmpty()) ifNullOrEmpty.invoke(this) else ifNotNullOrEmpty.invoke(this)
}

inline fun BooleanArray?.ifNullOrEmpty(ifNullOrEmpty: (BooleanArray?) -> Unit) {
	this.ifNullOrEmpty(ifNullOrEmpty, {})
}

inline fun BooleanArray?.ifNotNullOrEmpty(ifNotNullOrEmpty: (BooleanArray) -> Unit) {
	this.ifNullOrEmpty({}, ifNotNullOrEmpty)
}

inline fun ByteArray?.ifNullOrEmpty(ifNullOrEmpty: (ByteArray?) -> Unit, ifNotNullOrEmpty: (ByteArray) -> Unit) {
	if (null == this || this.isEmpty()) ifNullOrEmpty.invoke(this) else ifNotNullOrEmpty.invoke(this)
}

inline fun ByteArray?.ifNullOrEmpty(ifNullOrEmpty: (ByteArray?) -> Unit) {
	this.ifNullOrEmpty(ifNullOrEmpty, {})
}

inline fun ByteArray?.ifNotNullOrEmpty(ifNotNullOrEmpty: (ByteArray) -> Unit) {
	this.ifNullOrEmpty({}, ifNotNullOrEmpty)
}

inline fun CharArray?.ifNullOrEmpty(ifNullOrEmpty: (CharArray?) -> Unit, ifNotNullOrEmpty: (CharArray) -> Unit) {
	if (null == this || this.isEmpty()) ifNullOrEmpty.invoke(this) else ifNotNullOrEmpty.invoke(this)
}

inline fun CharArray?.ifNullOrEmpty(ifNullOrEmpty: (CharArray?) -> Unit) {
	this.ifNullOrEmpty(ifNullOrEmpty, {})
}

inline fun CharArray?.ifNotNullOrEmpty(ifNotNullOrEmpty: (CharArray) -> Unit) {
	this.ifNullOrEmpty({}, ifNotNullOrEmpty)
}

