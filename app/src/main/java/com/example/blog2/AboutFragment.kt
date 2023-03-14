package com.example.blog2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.blog2.databinding.FragmentAboutBinding


class AboutFragment : Fragment() {
    private var _binding: FragmentAboutBinding? = null
    private val binding get() = _binding !!


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentAboutBinding.inflate(layoutInflater,container,false)
        val view = binding.root
        val btnGoBack = binding.btnGoBack
        val btnNewsletter = binding.btnNewsletter


        btnGoBack.setOnClickListener(){
            Navigation.findNavController(view).navigate(R.id.action_global_homeFragment)
        }

        btnNewsletter.setOnClickListener(){
            Navigation.findNavController(view).navigate(R.id.action_aboutFragment_to_newsletterFragment)
        }

        return view
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }


}