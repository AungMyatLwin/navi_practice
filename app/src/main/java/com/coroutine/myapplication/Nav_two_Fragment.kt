package com.coroutine.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.coroutine.myapplication.databinding.FragmentNavTwoBinding
import com.coroutine.myapplication.databinding.FragmentNaviBinding

class Nav_two_Fragment : Fragment() {
    // TODO: Rename and change types of parameters


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }


    private var _binding: FragmentNavTwoBinding?=null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentNavTwoBinding.inflate(inflater, container, false)

        return binding.root
    }

}