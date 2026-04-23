package com.cavporn

import com.lagradost.cloudstream3.MainAPI
import com.lagradost.cloudstream3.SearchResponse
import com.lagradost.cloudstream3.TvType

class CavPornProvider : MainAPI() { // All providers must be an instance of MainAPI
    override var mainUrl = "https://cavporn.com" 
    override var name = "CavPorn"
    override val supportedTypes = setOf(TvType.NSFW)

    override var lang = "en"

    // Enable this when your provider has a main page
    override val hasMainPage = true

    // This function gets called when you search for something
    override suspend fun search(query: String): List<SearchResponse> {
        return listOf()
    }
}