package com.bugaga.feature3.di

import com.bugaga.core.di.CoreComponent
import com.bugaga.core.di.FacadeProvider
import dagger.Component

@Component(dependencies = [CoreComponent::class, FacadeProvider::class])
interface Feature3Component {
  @Component.Builder
  interface Builder {
    fun coreComponent(component: CoreComponent): Builder
    fun facadeProvider(provider: FacadeProvider): Builder
    fun build(): Feature3Component
  }
}