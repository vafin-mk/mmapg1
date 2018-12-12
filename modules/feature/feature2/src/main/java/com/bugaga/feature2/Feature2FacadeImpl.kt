package com.bugaga.feature2

import android.content.Context
import android.content.Intent
import com.bugaga.core.facade.Feature2Facade

class Feature2FacadeImpl: Feature2Facade {

  override fun startScreen(context: Context) {
    context.startActivity(Intent(context, Feature2Activity::class.java))
  }
}