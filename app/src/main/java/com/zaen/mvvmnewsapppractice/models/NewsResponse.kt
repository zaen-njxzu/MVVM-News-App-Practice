package com.zaen.mvvmnewsapppractice.models

import com.zaen.mvvmnewsapppractice.models.Article

data class NewsResponse(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)