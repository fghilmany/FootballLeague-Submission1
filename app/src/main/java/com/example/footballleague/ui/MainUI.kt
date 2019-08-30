package com.example.footballleague.ui

import com.example.footballleague.MainActivity
import org.jetbrains.anko.AnkoComponent
import org.jetbrains.anko.AnkoContext
import org.jetbrains.anko.matchParent
import org.jetbrains.anko.recyclerview.v7.recyclerView
import org.jetbrains.anko.verticalLayout

class MainUI : AnkoComponent<MainActivity>{
    companion object{
        const val club_list = 1
    }
    override fun createView(ui: AnkoContext<MainActivity>)= with(ui) {
        verticalLayout{
            recyclerView{
                id = club_list
            }.lparams{
                width = matchParent
                height = matchParent
            }
        }

    }
}