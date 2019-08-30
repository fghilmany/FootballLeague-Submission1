package com.example.footballleague.ui

import android.view.Gravity
import android.view.ViewGroup
import android.widget.LinearLayout
import org.jetbrains.anko.*

class ItemUI : AnkoComponent<ViewGroup> {

    companion object{
        const val club_image = 1
        const val club_name = 2
    }

    override fun createView(ui: AnkoContext<ViewGroup>) = with(ui) {

        verticalLayout{
            padding = dip(16)
            orientation = LinearLayout.HORIZONTAL

            imageView{
                id= club_image

            }.lparams(width= dip(50), height = dip(50))

            textView{
                id = club_name
                hint = "Barcelona FC"

            }.lparams{
                width = matchParent
                height = wrapContent
                gravity = Gravity.CENTER_VERTICAL
                margin = dip(10)
            }
        }

    }
}