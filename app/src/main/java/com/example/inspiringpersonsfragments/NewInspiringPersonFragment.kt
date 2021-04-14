package com.example.inspiringpersonsfragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.inspiringpersonsfragments.databinding.FragmentNewInspiringPersonBinding

class NewInspiringPersonFragment : Fragment() {
    private lateinit var binding: FragmentNewInspiringPersonBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding=FragmentNewInspiringPersonBinding.inflate(inflater,container,false)

        return binding.root
    }
}