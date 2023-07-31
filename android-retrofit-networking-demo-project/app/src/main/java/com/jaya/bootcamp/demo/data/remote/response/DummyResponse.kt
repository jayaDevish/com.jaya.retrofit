package com.jaya.bootcamp.demo.data.remote.response

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import com.jaya.bootcamp.instagram.data.model.Dummy

data class DummyResponse(
        @Expose
        @SerializedName("statusCode")
        var statusCode: String,

        @Expose
        @SerializedName("message")
        var message: String,

        @Expose
        @SerializedName("data")
        val data: List<Dummy>
)