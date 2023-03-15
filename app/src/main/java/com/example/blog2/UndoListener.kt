package com.example.blog2

import android.view.View

class UndoListener(val userList: ArrayList<User>): View.OnClickListener {
    override fun onClick(v: View) {   //(p0: View?)
        userList.clear()
        println(userList)
    }
}