package com.zaen.mvvmnewsapppractice.ui.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.zaen.mvvmnewsapppractice.R
import com.zaen.mvvmnewsapppractice.ui.NewsActivity
import com.zaen.mvvmnewsapppractice.ui.NewsViewModel

class ArticleFragment : Fragment(R.layout.fragment_article) {

    lateinit var viewModel: NewsViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel = (activity as NewsActivity).viewModel
    }
}