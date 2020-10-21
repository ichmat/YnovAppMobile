package com.test.ynov

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Html
import android.view.Menu
import android.view.MenuItem
import android.widget.NumberPicker
import android.widget.TextView
import androidx.appcompat.app.ActionBar
import org.jetbrains.anko.*
import org.jetbrains.anko.custom.style

class MainActivity : AppCompatActivity(), AnkoLogger {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var strUser : String = getString(R.string.user)
        val textname : TextView = findViewById(R.id.textName)
        textname.text = "UserName : $strUser"
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main,menu)
        val actionBar : ActionBar? = supportActionBar
        actionBar?.setDisplayShowTitleEnabled(true)
        actionBar?.setTitle(getString(R.string.app_name))
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val itemId : Int = item.itemId
        if(itemId == R.id.action_settings)
            toast("touched icon app")
        return super.onOptionsItemSelected(item)
    }

    override fun onStart(){
        super.onStart()
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