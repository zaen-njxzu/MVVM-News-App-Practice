package com.zaen.mvvmnewsapppractice.repository

import com.zaen.mvvmnewsapppractice.api.RetrofitInstance
import com.zaen.mvvmnewsapppractice.db.ArticleDatabase

class NewsRepository(
    val db: ArticleDatabase
) {

    suspend fun getBreakingNews(countryCode: String, pageNumber: Int) =
        RetrofitInstance.api.getBreakingNews(countryCode, pageNumber)

    suspend fun searchNews(searchQuery: String, pageNumber: Int) =
        RetrofitInstance.api.searchForNews(searchQuery, pageNumber)
}