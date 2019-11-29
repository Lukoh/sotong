/*
 * Copyright (C)  2019 Lukoh Nam, goForer
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.megazone.megatong.data.datasource.network.response

class Resource {
    internal lateinit var status: Status

    internal var message: String? = null

    internal var data: Any? = null

    internal var lastPage: Int = 0
    internal var errorCode: Int = 0

    fun success(data: Any?, lastPage: Int): Resource {
        status = Status.SUCCESS
        this.data = data
        message = null
        this.lastPage = lastPage

        return this
    }

    fun error(msg: String?, errorCode: Int): Resource {
        status = Status.ERROR
        this.errorCode = errorCode
        message = msg
        lastPage = 0

        return this
    }

    fun loading(data: Any?): Resource {
        status = Status.LOADING
        this.data = data
        message = null
        lastPage = 0

        return this
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        if (other == null || javaClass != other.javaClass) {
            return false
        }

        val resource = other as Resource?

        if (status !== resource?.status) {
            return false
        }

        if (if (message != null) message == resource.message else resource.message == null)
            if (if (data != null) data == resource.data else resource.data == null) return true
        return false

    }

    override fun hashCode(): Int {
        var result = status.hashCode()
        result = 31 * result + if (message != null) message!!.hashCode() else 0
        result = 31 * result + if (data != null) data?.hashCode()!! else 0
        return result
    }

    override fun toString(): String {
        return "Resource{" +
                "status=" + status +
                ", message='" + message + '\''.toString() +
                ", data=" + data +
                '}'.toString()
    }
}