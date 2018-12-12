package com.bugaga.feature1.di

import com.bugaga.core.di.CoreComponent
import com.bugaga.core.di.FacadeProvider
import com.bugaga.feature1.MainActivity
import dagger.Component

@Component(dependencies = [CoreComponent::class, FacadeProvider::class])
interface Feature1Component {
  @Component.Builder
  interface Builder {
    fun coreComponent(component: CoreComponent): Builder
    fun facadeProvider(provider: FacadeProvider): Builder
    fun build(): Feature1Component
  }

  fun inject(mainActivity: MainActivity)
}