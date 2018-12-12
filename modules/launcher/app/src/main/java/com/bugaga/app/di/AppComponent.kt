package com.bugaga.app.di

import com.bugaga.core.di.CoreComponent
import com.bugaga.core.di.FacadeProvider
import dagger.Component

@Component(dependencies = [CoreComponent::class], modules = [FacadeModule::class])
interface AppComponent: FacadeProvider {

  @Component.Builder
  interface Builder {
    fun coreComponent(component: CoreComponent): Builder
    fun build(): AppComponent
  }
}