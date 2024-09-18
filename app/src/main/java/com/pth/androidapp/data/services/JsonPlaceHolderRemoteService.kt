package com.pth.androidapp.data.services

import android.util.Log
import com.pth.androidapp.base.network.BaseRemoteService
import com.pth.androidapp.base.network.NetworkResult
import com.pth.androidapp.data.apis.JsonPlaceHolderApi
import com.pth.androidapp.data.modelJsons.PostJson
import com.pth.androidapp.ui.fragments.jsonPlaceHolder.JsonPlaceHolderFragment.Companion.JsonPlaceHolderTAG
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class JsonPlaceHolderRemoteService @Inject constructor(
    private val jsonPlaceHolderApi: JsonPlaceHolderApi
) : BaseRemoteService() {

    suspend fun getAllPost(): Flow<NetworkResult<List<PostJson>>> = apiRequestFlow {
        jsonPlaceHolderApi.getAllPost()
    }

}