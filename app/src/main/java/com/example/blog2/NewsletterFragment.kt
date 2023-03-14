package com.example.blog2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.blog2.databinding.FragmentNewsletterBinding

class NewsletterFragment : Fragment() {
    private var _binding: FragmentNewsletterBinding? = null
    private val binding get() = _binding!!


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentNewsletterBinding.inflate(layoutInflater,container, false)
        val view = binding.root
        val username = binding.tvUsername  // EditText
        val userEmail = binding.tvUserEmail // EditText



        return view
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }


}