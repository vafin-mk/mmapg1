package com.bugaga.core.di

import com.bugaga.core.something.SomeCoreDependency
import com.bugaga.core.something.SomeCoreDependencyImpl
import dagger.Binds
import dagger.Module

@Module
interface CoreModule {

  @Binds
  fun dependency(impl: SomeCoreDependencyImpl): SomeCoreDependency
}