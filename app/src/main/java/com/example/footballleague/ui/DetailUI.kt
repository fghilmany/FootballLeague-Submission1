package com.example.footballleague.ui

import android.view.Gravity
import com.example.footballleague.DetailAct
import org.jetbrains.anko.*

class DetailUI : AnkoComponent<DetailAct>{
    companion object{
        const val club_image = 1
        const val club_name = 2
        const val club_desc = 3
    }

    override fun createView(ui: AnkoContext<DetailAct>) = with(ui) {
        scrollView{
            verticalLayout{
                imageView{
                    id = club_image

                }.lparams{
                    width = matchParent
                    height = dip(300)
                    margin = dip(16)
                }

                textView{
                    id = club_name
                    textSize = 24f
                }.lparams{
                    width = wrapContent
                    height = wrapContent
                    gravity = Gravity.CENTER
                    margin = dip(16)
                }

                textView{
                    id = club_desc
                    textSize = 12f
                }.lparams{
                    width = matchParent
                    height = wrapContent
                    margin = dip(10)
                }

            }
        }
    }
}