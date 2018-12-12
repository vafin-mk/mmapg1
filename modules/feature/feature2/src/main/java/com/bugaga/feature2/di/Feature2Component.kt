package com.bugaga.feature2.di

import com.bugaga.core.di.CoreComponent
import com.bugaga.core.di.FacadeProvider
import com.bugaga.feature2.Feature2Activity
import dagger.Component

@Component(dependencies = [CoreComponent::class, FacadeProvider::class])
interface Feature2Component {
  @Component.Builder
  interface Builder {
    fun coreComponent(component: CoreComponent): Builder
    fun facadeProvider(provider: FacadeProvider): Builder
    fun build(): Feature2Component
  }

  fun inject(feature2Activity: Feature2Activity)
}