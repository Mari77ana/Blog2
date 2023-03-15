package com.example.blog2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentContainerView
import androidx.fragment.app.commit
import com.example.blog2.databinding.FragmentBlogPageBinding

class BlogPageFragment : Fragment() {
    private var _binding: FragmentBlogPageBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentBlogPageBinding.inflate(layoutInflater,container,false)
        val view = binding.root
        val btnCreateFragment = binding.btnCreateFragment
        val fcvSpawnFragment = binding.fcvSpawnFragment

        btnCreateFragment.setOnClickListener(){
            createFragment(fcvSpawnFragment)
        }

        return view
    }
    private fun createFragment(fcvSpawnFragment: FragmentContainerView) {
        if( childFragmentManager.findFragmentByTag("MyTag") == null){
            parentFragmentManager.commit {
                setReorderingAllowed(true)
                add(fcvSpawnFragment.id,WriteBlogFragment())
            }
        }
        else{
            println("exists")
            parentFragmentManager.beginTransaction().remove(
                parentFragmentManager.findFragmentByTag("MyTag")!!
            ).commit()
        }

    }



}