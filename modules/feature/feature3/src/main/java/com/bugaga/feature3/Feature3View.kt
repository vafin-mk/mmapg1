package com.bugaga.feature3

import android.content.Context
import android.widget.LinearLayout
import android.widget.TextView

class Feature3View(context: Context): LinearLayout(context) {

  init {
    orientation = HORIZONTAL
    val tv = TextView(context)
    tv.text = "Feature 3 Text"
    tv.textSize = 30F

    addView(tv)
  }
}