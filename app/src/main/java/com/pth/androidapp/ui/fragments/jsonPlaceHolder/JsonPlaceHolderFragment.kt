package com.pth.androidapp.ui.fragments.jsonPlaceHolder

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.pth.androidapp.base.fragments.BaseFragment
import com.pth.androidapp.base.network.NetworkResult
import com.pth.androidapp.databinding.FragmentJsonPlaceHolderBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class JsonPlaceHolderFragment : BaseFragment() {
    companion object {
        const val JsonPlaceHolderTAG = "JsonPlaceHolderFragment"
    }

    private var _binding: FragmentJsonPlaceHolderBinding? = null
    private val binding get() = _binding!!
//    private val viewModel: JsonPlaceHolderViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentJsonPlaceHolderBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        observeViewModel()
    }

    private fun observeViewModel() {
//        viewModel.posts.observe(viewLifecycleOwner) { result ->
//            when (result) {
//                is NetworkResult.Success -> {
//                }
//                is NetworkResult.Error -> {
//
//                }
//                is NetworkResult.Loading -> {
//
//                }
//            }
//        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}