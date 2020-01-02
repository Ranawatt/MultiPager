package com.example.multipager.api

import com.example.multipager.model.Repo
import com.google.gson.annotations.SerializedName
import java.util.Collections.emptyList

/**
 * Data class to hold repo responses from searchRepo API calls.
 */
data class RepoSearchResponse(
    @SerializedName("total_count") val total: Int = 0,
    @SerializedName("items") val items: List<Repo> = emptyList(),
    val nextPage: Int? = null
)