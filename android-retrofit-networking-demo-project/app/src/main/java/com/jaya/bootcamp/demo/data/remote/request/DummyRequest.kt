package com.jaya.bootcamp.demo.data.remote.request

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class DummyRequest(
        @Expose
        @SerializedName("id")
        var id: String
)