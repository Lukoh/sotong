package com.goforer.sotong.presentation.vm

import androidx.lifecycle.ViewModel

abstract class BaseViewModel<P, T>: ViewModel() {
    abstract fun setParam(params: P)
}