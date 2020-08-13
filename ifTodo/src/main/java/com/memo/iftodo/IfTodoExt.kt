package com.memo.iftodo

inline fun <T> T?.ifNullTodo(ifNullTodo: (T?) -> Unit, ifNotNullTodo: (T) -> Unit) {
	if (null == this) ifNullTodo.invoke(this) else ifNotNullTodo.invoke(this)
}

inline fun <T> T?.ifNullTodo(ifNotNullTodo: (T?) -> Unit) {
	this.ifNullTodo(ifNotNullTodo, {})
}

inline fun <T> T?.ifNotNullTodo(ifNotNullTodo: (T) -> Unit) {
	this.ifNullTodo({}, ifNotNullTodo)
}

inline fun <T> T.ifConvertTodo(convert: (T) -> Boolean, ifTrueTodo: (T) -> Unit, ifFalseTodo: (T) -> Unit) {
	if (convert.invoke(this)) ifTrueTodo.invoke(this) else ifFalseTodo.invoke(this)
}

inline fun <T> T.ifConvertTrueTodo(convert: (T) -> Boolean, ifTrueTodo: (T) -> Unit) {
	this.ifConvertTodo(convert, ifTrueTodo, {})
}

inline fun <T> T.ifConvertFalseTodo(convert: (T) -> Boolean, ifFalseTodo: (T) -> Unit) {
	this.ifConvertTodo(convert, {}, ifFalseTodo)
}

inline fun Boolean.ifTodo(ifTrueTodo: () -> Unit = {}, ifFalseTodo: () -> Unit = {}) {
	if (this) ifTrueTodo.invoke() else ifFalseTodo.invoke()
}

