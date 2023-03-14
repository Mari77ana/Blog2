package com.example.blog2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.blog2.databinding.FragmentWriteBlogBinding


class WriteBlogFragment : Fragment() {
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
            val blogPost = tvWriteBlogPost.text.toString()
            val blogList = AddBlogPost()

            if (title.isNotEmpty()&& blogPost.isNotEmpty()){
                blogList.addBlog(title,blogPost)
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