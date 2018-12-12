package com.bugaga.app.di

import com.bugaga.app.ModuleFacadeImpl
import com.bugaga.core.facade.ModuleFacade
import dagger.Binds
import dagger.Module

@Module
interface FacadeModule {

  @Binds
  fun facadeModule(impl: ModuleFacadeImpl): ModuleFacade
}