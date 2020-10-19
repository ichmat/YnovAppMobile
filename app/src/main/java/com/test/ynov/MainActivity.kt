package com.test.ynov

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Html
import android.widget.NumberPicker
import androidx.appcompat.app.ActionBar
import org.jetbrains.anko.*

class MainActivity : AppCompatActivity(), AnkoLogger {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStart(){
        super.onStart()
        /* info(getString(R.string.text_onStart))
        wtf(getString(R.string.text_onStart))
        alert("Hello"){
            title = "Awesome quote"
            positiveButton("Love") { toast("Yo") }
            negativeButton("Not at all") { }
            neutralPressed("well") { toast("okay then ...") }
        }.show() */

    }

    override fun onResume() {
        super.onResume()
    }

    override fun onPause() {
        super.onPause()
    }

    override fun onStop() {
        super.onStop()
    }

    override fun onDestroy() {
        super.onDestroy()
    }
}