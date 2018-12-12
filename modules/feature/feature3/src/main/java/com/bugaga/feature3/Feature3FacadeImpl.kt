package com.bugaga.feature3

import android.content.Context
import android.view.View
import android.widget.Toast
import com.bugaga.core.facade.Feature3Facade

class Feature3FacadeImpl: Feature3Facade {

  override fun startScreen(context: Context) {
    Toast.makeText(context, "Whoops", Toast.LENGTH_LONG).show()
  }

  override fun giveButton(context: Context): View {
    return Feature3View(context)
  }
}