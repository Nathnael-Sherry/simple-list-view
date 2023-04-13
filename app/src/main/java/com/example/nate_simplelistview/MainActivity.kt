package com.example.nate_simplelistview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var listview = findViewById<ListView>(R.id.my_list)
        var list_data:Array<String> = arrayOf("FULIZA", "SEND MONEY", "KCB MPESA")

//        SET AN ADAPTER
        var data_adapter: ArrayAdapter<String> = ArrayAdapter(

            android.R.layout.simple_list_item_1, list_data

        )
        listview.adapter = data_adapter

    }
}