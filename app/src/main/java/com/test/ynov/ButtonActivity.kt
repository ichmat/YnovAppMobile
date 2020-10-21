package com.test.ynov

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.os.PersistableBundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity;
import org.jetbrains.anko.*

class ButtonActivity : AppCompatActivity(), AnkoLogger{
    lateinit var textEdit: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_button)
    }

    override fun onStart() {
        super.onStart()

        val button : Button = findViewById(R.id.buttonToClick)
        button.setOnClickListener { testClick() }

        textEdit = findViewById(R.id.editTextTest)
        textEdit.addTextChangedListener(textWatcher)
    }

    fun testClick(){
        longToast(getString(R.string.app_name))
    }

    fun openBrowser(view : View){
        val url = "http://www.google.com"
        val intent = Intent(Intent.ACTION_VIEW)
        intent.data = Uri.parse(url)
        startActivity(intent)
    }

    private val textWatcher = object : TextWatcher {
        override fun afterTextChanged(s: Editable?) {
        }
        override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
        }
        override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
           longToast("${textEdit.text} / start = $start / before = $before / count = $count")
        }
    }
}