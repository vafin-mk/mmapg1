package com.bugaga.feature1.di

import com.bugaga.core.CoreApp
import com.bugaga.core.di.AppDiContainer

object DI {

  val component by lazy {
    DaggerFeature1Component.builder()
      .coreComponent(CoreApp.instance.component)
      .facadeProvider((CoreApp.instance.applicationContext as AppDiContainer).facadeProvider())
      .build()
  }
}