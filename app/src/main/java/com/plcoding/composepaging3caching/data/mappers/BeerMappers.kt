package com.plcoding.composepaging3caching.data.mappers

import com.plcoding.composepaging3caching.data.local.BeerEntity
import com.plcoding.composepaging3caching.data.network.Beer
import com.plcoding.composepaging3caching.data.remote.BeerDto

fun BeerDto.toBeerEntity() : BeerEntity{
    return BeerEntity(
        id = id,
        name = name,
        description = description,
        tagline = tagline,
        imageUrl = image_url,
        firstBrewed = first_brewed
    )
}

fun BeerEntity.toBeer() : Beer{
    return Beer(
        id = id,
        name = name,
        description = description,
        tagline = tagline,
        image_url = imageUrl,
        first_brewed = firstBrewed
    )
}