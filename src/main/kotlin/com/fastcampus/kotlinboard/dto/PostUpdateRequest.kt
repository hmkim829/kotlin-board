package com.fastcampus.kotlinboard.dto

data class PostUpdateRequest(
    val title: String,
    val content: String,
    val updateBy: String,
)
