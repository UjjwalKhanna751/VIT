package com.example.vit

import android.os.Bundle
import android.os.StrictMode
import android.util.Log
import android.view.View
import android.widget.AdapterView
import android.widget.ListView
import android.widget.Spinner
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class HomeActivity : AppCompatActivity(), AdapterView.OnItemSelectedListener {
    lateinit var mySpinner:Spinner
    var TAG= HomeActivity::class.java.simpleName

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home)
        mySpinner= findViewById(R.id.spinner)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        mySpinner.onItemSelectedListener= this

        //var data = intent.extras?.getString("nkey")
        //Log.i("Home Acttivity","Button was clicked"+ data)
        //var homeTextView: TextView = findViewById(R.id.tvhome)
        //homeTextView.setText(data)
    }

    override fun onItemSelected(adapter: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {

        //val position
        //var item:String=adapter?.getItemAtPosition(position).toString()

        //Log.i(TAG,item)
    }

    override fun onNothingSelected(p0: AdapterView<*>?) {
        TODO("Not yet implemented")
    }


}

