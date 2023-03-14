package com.example.blog2

class AddBlogPost {

    val blogList = ArrayList<BlogUiState>()  // type BlogUiState

    fun addBlog(title: String, blogPost: String){
        blogList.add( BlogUiState(title, blogPost))
        println(blogList.toString())

    }
}