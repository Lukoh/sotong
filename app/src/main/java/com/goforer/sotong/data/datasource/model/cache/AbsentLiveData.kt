package com.goforer.sotong.data.datasource.model.cache

import androidx.lifecycle.MutableLiveData

/**
 * A LiveData class that has `null` value.
 */
class AbsentLiveData<T> private constructor() : MutableLiveData<T>() {
    init {
        postValue(null)
    }

    companion object {
        fun <T> create(): MutableLiveData<T> {
            return AbsentLiveData()
        }
    }
}