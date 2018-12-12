package com.bugaga.core.di

import com.bugaga.core.something.SomeCoreDependency
import dagger.Component

@Component(modules = [
  CoreModule::class
])
interface CoreComponent {

  @Component.Builder
  interface Builder {
    fun build(): CoreComponent
  }

  fun dependency(): SomeCoreDependency
}