package com.bugaga.core.facade

import android.content.Context
import android.view.View

interface Feature3Facade {

  fun startScreen(context: Context)
  fun giveButton(context: Context): View
}