# IfNull
为空判断
```
   {
		collections.ifNullOrEmpty({ log(true) }, { log(false) })
		collections.ifNullOrEmpty { log(true) }
		collections?.add("1")
		collections.ifNotNullOrEmpty { log(false) }

		array.ifNullOrEmpty({ log(true) }, { log(false) })
		array.ifNullOrEmpty { log(true) }
		array = arrayOf("1")
		array.ifNotNullOrEmpty { log(false) }

		nullStr.ifNullStrTodo({ log(true) }, { log(false) })
		nullStr.ifNullStrTodo { log((true)) }
		nullStr = "aaa"
		nullStr.ifNotNullStrTodo { log(false) }

		nullStr.ifConvertTodo({ it == "aaa" }, { log(false) }, { log(true) })

		text.ifNullTodo({ log(true) }, { log(false) })
		text.ifNullTodo { log(true) }
		text = TextView(this)
		text.ifNotNullTodo { log(false) }
	}

	private fun log(isEmpty: Boolean) {
		Log.i("ifTodo", if (isEmpty) "数据为空" else "数据不为空")
	}

```
