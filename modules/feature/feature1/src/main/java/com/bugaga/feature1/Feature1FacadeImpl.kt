package com.bugaga.feature1

import com.bugaga.core.CoreApp
import com.bugaga.core.facade.Feature1Facade

class Feature1FacadeImpl: Feature1Facade {

  override fun exitApp() {
    throw RuntimeException("Exit from app:)")
  }
}