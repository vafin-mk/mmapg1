package com.bugaga.core

import android.app.Application
import com.bugaga.core.di.DaggerCoreComponent

abstract class CoreApp: Application() {

  companion object {
    lateinit var instance: CoreApp
  }

  val component by lazy {
    DaggerCoreComponent.builder().build()
  }

  override fun onCreate() {
    super.onCreate()
    instance = this
  }
}