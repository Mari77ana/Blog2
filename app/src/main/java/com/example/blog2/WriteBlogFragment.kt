package com.example.blog2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.activity.viewModels
import androidx.fragment.app.viewModels
import com.example.blog2.databinding.FragmentWriteBlogBinding
import com.example.blog2.viewmodel.BlogViewModel


class WriteBlogFragment : Fragment() {

    // Initialization
    val blogViewModel: BlogViewModel by viewModels()
    private var _binding: FragmentWriteBlogBinding? = null
    private val binding get() = _binding!!


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       _binding = FragmentWriteBlogBinding.inflate(layoutInflater,container,false)
        val view = binding.root
        val btnCloseFragment = binding.btnCloseFragment
        val tvWriteTitle = binding.tvTitle    // EditText
        val tvWriteBlogPost = binding.tvBlogPost //EditText
        val btnSubmitBlog = binding.btnSubmitBlog // Button


        btnSubmitBlog.setOnClickListener(){
            val title = tvWriteTitle.text.toString()
            val blog = tvWriteBlogPost.text.toString()


            if (title.isNotEmpty() && blog.isNotEmpty()){
                blogViewModel.addBlog(title, blog)
            }
            else{
                Toast.makeText(context,"Please fill in all fields", Toast.LENGTH_LONG).show()
            }

        }
        btnCloseFragment.setOnClickListener(){
            parentFragmentManager.beginTransaction().remove(this).commit()
        }
        return view

    }
    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }


}