package com.smdsa.sqlitewithroom.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.smdsa.sqlitewithroom.R
import com.smdsa.sqlitewithroom.databinding.FragmentMenuBinding

class MenuFragment : Fragment() {

    private lateinit var binding: FragmentMenuBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMenuBinding.inflate(inflater)
        binding.buttonToRead.setOnClickListener{
            findNavController().navigate(R.id.action_menuFragment_to_readDataFragment)
        }
        binding.buttonToWrite.setOnClickListener{
            findNavController().navigate(R.id.action_menuFragment_to_writeDataFragment)
        }
        return binding.root
    }
}