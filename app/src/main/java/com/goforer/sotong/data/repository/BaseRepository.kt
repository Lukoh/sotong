/*
 * Copyright 2019 Lukoh Nam, goForer
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 2 of the License,
 * or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License along with this program.
 * If not, see <http://www.gnu.org/licenses/>.
 */

package com.goforer.sotong.data.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.goforer.sotong.data.datasource.network.response.Resource
import com.goforer.sotong.data.datasource.network.rest.ServiceAPI
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
abstract class BaseRepository<T> {
    @field:Inject
    lateinit var serviceAPI: ServiceAPI

    abstract suspend fun work(liveData: MutableLiveData<T>): LiveData<Resource>

    companion object {
        internal const val PER_PAGE = 20
        internal const val INDEX = 1
    }
}