package com.example.footballleague

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.example.footballleague.ui.DetailUI
import com.squareup.picasso.Picasso
import org.jetbrains.anko.setContentView

class DetailAct : AppCompatActivity() {

    private var name: String = ""
    private var desc : String = ""
    private var image : Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        DetailUI().setContentView(this)

        val nameTV = findViewById<TextView>(DetailUI.club_name)
        val descTV = findViewById<TextView>(DetailUI.club_desc)
        val imageIV = findViewById<ImageView>(DetailUI.club_image)

        val  intent = intent
        //Picasso.get().load(image).into(imageIV)
        image = intent.getIntExtra("image",0)
        Picasso.get().load(image).into(imageIV)  
        name = intent.getStringExtra("name")
        nameTV.text = name
        desc = intent.getStringExtra("desc")
        descTV.text = desc

    }
}
