package com.bugaga.app

import com.bugaga.app.di.DaggerAppComponent
import com.bugaga.core.CoreApp
import com.bugaga.core.di.AppDiContainer
import com.bugaga.core.di.FacadeProvider

class App: CoreApp(), AppDiContainer{

  private val appComponent by lazy {
    DaggerAppComponent.builder().coreComponent(CoreApp.instance.component).build()
  }

  override fun facadeProvider(): FacadeProvider = appComponent
}