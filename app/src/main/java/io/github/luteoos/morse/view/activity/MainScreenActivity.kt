package io.github.luteoos.morse.view.activity

import android.os.Bundle
import io.github.luteoos.morse.viewmodel.MainScreenViewModel
import io.github.luteoos.mvvmbaselib.BaseActivityMVVM

class MainScreenActivity : BaseActivityMVVM<MainScreenViewModel>() {

    override fun getLayoutID(): Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = getViewModel(this)

    }
}