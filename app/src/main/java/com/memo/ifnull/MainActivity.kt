package com.memo.ifnull

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.memo.iftodo.*

class MainActivity : AppCompatActivity() {

	private var collections: ArrayList<String>? = arrayListOf()

	private var array: Array<String>? = arrayOf()

	private var nullStr: String? = "Null"

	private var text: TextView? = null

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)

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

}