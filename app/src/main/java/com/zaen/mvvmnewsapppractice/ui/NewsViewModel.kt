package com.zaen.mvvmnewsapppractice.ui

import androidx.lifecycle.ViewModel
import com.zaen.mvvmnewsapppractice.repository.NewsRepository

class NewsViewModel(
    val newsRepository: NewsRepository
) : ViewModel() {
}