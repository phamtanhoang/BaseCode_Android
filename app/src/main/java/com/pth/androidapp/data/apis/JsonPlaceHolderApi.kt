package com.pth.androidapp.data.apis

import com.pth.androidapp.data.modelJsons.PostJson
import retrofit2.Response
import retrofit2.http.GET

interface JsonPlaceHolderApi {

    @GET("/posts")
    suspend fun getAllPost(): Response<List<PostJson>>

}