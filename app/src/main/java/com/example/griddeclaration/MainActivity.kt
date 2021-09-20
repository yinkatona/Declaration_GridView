package com.example.griddeclaration

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.example.griddeclaration.adapter.GridItemAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val cardTitles : Array<String> = resources.getStringArray(R.array.cardTitles)
        val cardImages : Array<String> = resources.getStringArray(R.array.cardImages)

        val adapter = GridItemAdapter(cardTitles, cardImages)
        val gridLayout = GridLayoutManager(this, 3)
        recyclerGrid.layoutManager = gridLayout
        recyclerGrid.adapter = adapter

    }
}