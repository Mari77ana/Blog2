package com.example.blog2

import android.os.Bundle
import android.util.Patterns
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.blog2.databinding.FragmentNewsletterBinding
import com.google.android.material.snackbar.Snackbar

class NewsletterFragment : Fragment() {
    private var _binding: FragmentNewsletterBinding? = null
    private val binding get() = _binding!!


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentNewsletterBinding.inflate(layoutInflater,container, false)
        val view = binding.root
        val userName = binding.tvUsername  // EditText
        val userEmail = binding.tvUserEmail // EditText
        val btnConfirm = binding.btnConfirm  // Button



        btnConfirm.setOnClickListener(){
            val name = userName.text.toString()
            val email = userEmail.text.toString()
            val userList = ArrayList<User>()

            if(name.isNotEmpty() && Patterns.EMAIL_ADDRESS.matcher(email).matches() && email.isNotEmpty()){
                userList.add(User(name,email))

                Snackbar.make(it,"This is a simple Snackbar",Snackbar.LENGTH_LONG).setAction("UNDO", UndoListener(userList)).show()
            }
            else{
                Toast.makeText(context, "Please fill in fields" ,  Toast.LENGTH_LONG).show()

            }



        }


        return view
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }


}