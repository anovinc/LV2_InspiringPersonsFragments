package com.example.inspiringpersonsfragments.fragments

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
        binding = FragmentNewInspiringPersonBinding.inflate(inflater, container, false)

        return binding.root
    }

    companion object {
        const val TAG = "New inspiring person"
        fun create(): NewInspiringPersonFragment {
            return NewInspiringPersonFragment()
        }
    }
}