package com.pth.androidapp.ui.activities

import android.os.Bundle
import androidx.lifecycle.lifecycleScope
import com.pth.androidapp.base.activities.BaseActivity
import com.pth.androidapp.databinding.ActivitySplashBinding
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@AndroidEntryPoint
class SplashActivity : BaseActivity() {

    companion object {
        private const val SPLASH_DELAY:Long = 3000
    }

    private lateinit var binding: ActivitySplashBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setupView()
        startMainActivityAfterDelay()
    }
    private fun setupView() {
        binding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setupWindowInsets(binding)

    }

    private fun startMainActivityAfterDelay() {
        lifecycleScope.launch {
            delay(SPLASH_DELAY)
            navigateToActivity(MainActivity::class.java)
        }
    }

}