package com.bugaga.feature3.di

import com.bugaga.core.CoreApp
import com.bugaga.core.di.AppDiContainer

object DI {

  val component by lazy {
    DaggerFeature3Component.builder()
      .coreComponent(CoreApp.instance.component)
      .facadeProvider((CoreApp.instance.applicationContext as AppDiContainer).facadeProvider())
      .build()
  }
}