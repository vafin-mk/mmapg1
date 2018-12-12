package com.bugaga.core.di

import com.bugaga.core.facade.ModuleFacade

interface FacadeProvider {

  fun provideFacade(): ModuleFacade
}