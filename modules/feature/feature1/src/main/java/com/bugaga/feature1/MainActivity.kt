package com.bugaga.feature1

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.bugaga.core.facade.ModuleFacade
import com.bugaga.core.something.SomeCoreDependency
import com.bugaga.feature1.di.DI
import kotlinx.android.synthetic.main.ac_main.*
import javax.inject.Inject

class MainActivity: AppCompatActivity() {

  @Inject
  lateinit var someCoreDependency: SomeCoreDependency

  @Inject
  lateinit var moduleFacade: ModuleFacade

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.ac_main)
    DI.component.inject(this)
    someCoreDependency.doSomething("Feature1")

    feature2Btn.setOnClickListener { moduleFacade.feature2Facade().startScreen(this) }
    feature3Btn.setOnClickListener { moduleFacade.feature3Facade().startScreen(this) }

    feature3ViewHolder.addView(moduleFacade.feature3Facade().giveButton(this))
  }
}