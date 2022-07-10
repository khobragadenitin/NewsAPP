package com.nitin.newsapp.domain.repository

import androidx.lifecycle.LiveData
import com.nitin.newsapp.data.model.APIResponse
import com.nitin.newsapp.data.model.Article
import com.nitin.newsapp.data.util.Resource
import kotlinx.coroutines.flow.Flow

interface NewsRepository {

    suspend fun getNewsHeadline() : Resource<APIResponse>

    suspend fun getSearchNews(searchQuery: String) : Resource<APIResponse>

    suspend fun saveNews(article: Article)

    suspend fun deleteNews(article: Article)

    fun getSavedNews() : Flow<List<Article>>


}