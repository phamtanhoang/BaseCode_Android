package com.pth.androidapp.data.repositories

import com.pth.androidapp.base.network.NetworkResult
import com.pth.androidapp.data.modelJsons.PostJson
import com.pth.androidapp.data.services.JsonPlaceHolderRemoteService
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class JsonPlaceHolderRepository @Inject constructor(
    private val jsonPlaceHolderRemoteService: JsonPlaceHolderRemoteService
) {
    suspend fun getAllPost(): Flow<NetworkResult<List<PostJson>>> = jsonPlaceHolderRemoteService.getAllPost()
}