package com.example.blog2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.blog2.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {
    private var _binding: FragmentHomeBinding? = null
    private  val binding get() = _binding !!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View?{
        _binding = FragmentHomeBinding.inflate(layoutInflater,container, false)
        val view = binding.root
        val btnAboutUs = binding.btnAboutUs
        val btnBlogPage = binding.btnBlogPage

        btnAboutUs.setOnClickListener(){
            Navigation.findNavController(view).navigate(R.id.action_homeFragment_to_aboutFragment)

        }
        btnBlogPage.setOnClickListener(){
            Navigation.findNavController(view).navigate(R.id.action_homeFragment_to_blogPostFragment)
        }
        return view
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }



}