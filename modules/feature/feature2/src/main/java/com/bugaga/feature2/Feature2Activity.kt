package com.bugaga.feature2

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.bugaga.core.facade.ModuleFacade
import com.bugaga.core.something.SomeCoreDependency
import com.bugaga.feature2.di.DI
import kotlinx.android.synthetic.main.ac_f2.*
import javax.inject.Inject

class Feature2Activity: AppCompatActivity() {

  @Inject
  lateinit var someCoreDependency: SomeCoreDependency

  @Inject
  lateinit var moduleFacade: ModuleFacade

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.ac_f2)
    DI.component.inject(this)
    exitButton.setOnClickListener { moduleFacade.feature1Facade().exitApp() }
    someCoreDependency.doSomething("Feature2")
  }
}