package com.zaen.mvvmnewsapppractice.models

import com.zaen.mvvmnewsapppractice.models.Article

data class NewsResponse(
    val articles: MutableList<Article>,
    val status: String,
    val totalResults: Int
)