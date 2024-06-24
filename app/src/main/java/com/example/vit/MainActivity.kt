package com.example.vit

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    var TAG="MainActiviy"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        Log.i(TAG,"Activity is getting created")
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        fun onStart(){
            super.onStart()
            Log.e(TAG,"Log is getting started")
        }

        fun onPause(){
            super.onPause()
            Log.w(TAG,"Log is in pause")
        }

        fun onStop(){
            super.onPause()
            Log.d(TAG,"Log is getting stopped")
        }

        fun onDestroy() {
            super.onDestroy()
            Log.v(TAG,"Log is getting destroyed")
        }
    }

    fun myClickHandler(view: View) {
        Log.i("MainActivity","button was clicked")
        /*var webIntent:Intent = Intent(Intent.ACTION_VIEW,Uri.parse("http://www.yahoo.com"))
        startActivity(webIntent)*/
        add(10,20)
        var hIntent = Intent(this,HomeActivity::class.java)
        hIntent.putExtra("nkey","ujjwal-android")

        startActivity(hIntent)
    }

    private fun add(i: Int, i1: Int): Int {
        var c=20
        var d=20*i
        return i + i1
        mul(5,10)


    }

    private fun mul(i: Int, i1: Int) {
        val d=i*i1
        div(10,2)

    }

    private fun div(i: Int, i1: Int) {
        val d=i+i*1
        add(10,2)

    }
}

