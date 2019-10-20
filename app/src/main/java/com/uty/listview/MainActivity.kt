package com.uty.listview_a

import android.R.layout.simple_list_item_1
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.uty.listview.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val languages= listOf("Kotlin", "Phyton", "Ruby", "JavaScript", "PHP")

        List_view .adapter = ArrayAdapter(this, simple_list_item_1, languages)

        List_view.setOnItemClickListener{ parent, view, position, id ->
            Toast.makeText(this, "Anda memilih: " +
                    "${languages[position]}",Toast.LENGTH_SHORT).show()}



    }
}
