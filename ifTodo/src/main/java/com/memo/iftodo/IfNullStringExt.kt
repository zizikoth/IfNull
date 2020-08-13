package com.memo.iftodo

import java.util.*

inline fun String?.ifNullStrTodo(ifNullStrTodo: (String?) -> Unit , ifNotNullStrTodo: (String) -> Unit ) {
	val isNullOrEmpty = this.isNullOrEmpty()
	val isNullStr = "null" == this?.toLowerCase(Locale.getDefault())
	if (isNullOrEmpty || isNullStr) {
		ifNullStrTodo.invoke(this)
	} else {
		ifNotNullStrTodo.invoke(this!!)
	}
}

inline fun String?.ifNullStrTodo(ifNullStrTodo: (String?) -> Unit){
	this.ifNullStrTodo(ifNullStrTodo,{})
}

inline fun String?.ifNotNullStrTodo(ifNotNullTodo: (String) -> Unit){
	this.ifNullStrTodo({},ifNotNullTodo)
}