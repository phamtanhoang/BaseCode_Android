package com.pth.androidapp.data.repositories

import com.pth.androidapp.data.services.AuthRemoteService
import javax.inject.Inject


class AuthRepository @Inject constructor(
    private val customerRemoteService: AuthRemoteService
) {

}