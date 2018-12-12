package com.bugaga.core.something

import android.util.Log
import javax.inject.Inject

class SomeCoreDependencyImpl @Inject constructor(): SomeCoreDependency {

  override fun doSomething(from: String) {
    Log.w("CoreModule", "Done something from $from")
  }
}