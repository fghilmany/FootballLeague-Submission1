package com.example.footballleague

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.Toast
import com.example.footballleague.ui.MainUI
import org.jetbrains.anko.setContentView
import org.jetbrains.anko.startActivity

class MainActivity : AppCompatActivity() {

    private  var items : MutableList<Item> = mutableListOf()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        MainUI().setContentView(this)

        val list = findViewById<RecyclerView>(MainUI.club_list)
        initData()

        list.layoutManager = LinearLayoutManager(this)
        list.adapter = FootballAdapter( items){
            startActivity<DetailAct>("name" to "${it.name}", "image" to it.image, "desc" to "${it.desc}")
            val toast = Toast.makeText(applicationContext,it.name, Toast.LENGTH_SHORT)
            toast.show()
        }
    }

    private fun initData (){
        val name = resources.getStringArray(R.array.club_name)

        val image = resources.obtainTypedArray(R.array.club_image)

        val desc = resources.getStringArray(R.array.club_desc)

        items.clear()
        for (i in name.indices){
            items.add(Item(name [i], image.getResourceId(i,0), desc[i]))
        }
        image.recycle()
    }
}
