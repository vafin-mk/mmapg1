package com.bugaga.app

import com.bugaga.core.facade.Feature1Facade
import com.bugaga.core.facade.Feature2Facade
import com.bugaga.core.facade.Feature3Facade
import com.bugaga.core.facade.ModuleFacade
import com.bugaga.feature1.Feature1FacadeImpl
import com.bugaga.feature2.Feature2FacadeImpl
import com.bugaga.feature3.Feature3FacadeImpl
import javax.inject.Inject

class ModuleFacadeImpl @Inject constructor(): ModuleFacade {

  private val f1 by lazy { Feature1FacadeImpl() }
  private val f2 by lazy { Feature2FacadeImpl() }
  private val f3 by lazy { Feature3FacadeImpl() }

  override fun feature1Facade(): Feature1Facade = f1
  override fun feature2Facade(): Feature2Facade = f2
  override fun feature3Facade(): Feature3Facade = f3
}