package com.example.blog2

import android.provider.ContactsContract.CommonDataKinds.Email
import androidx.lifecycle.ViewModel

data class User(var userName : String, var userEmail: String) {
    override fun toString(): String {
        return "User(name='$userName', email='$userEmail')"
    }
}


/*
class AddUserViewModel(): ViewModel() {


    val userList = ArrayList<User>()  // ArrayList of type object User

    fun addUser(userName: String, userEmail: String){
        userList.add(User(userName,userEmail)) // add object User, attributes userName and userEmail
        println(userList.toString())

    }
}

 */