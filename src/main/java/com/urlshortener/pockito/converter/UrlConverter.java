package com.urlshortener.pockito.converter;

import com.urlshortener.pockito.dto.UrlDto;
import com.urlshortener.pockito.model.URLEntity;

public class UrlConverter {
    public static URLEntity dtoToEntity(UrlDto urlDto) {
        URLEntity url = new URLEntity(urlDto.getUrl(), urlDto.getShortId());
        url.setOriginalUrl(urlDto.getUrl());
        url.setShortId(urlDto.getShortId());
        return url;
    }

    public static UrlDto entityToDto(URLEntity url) {
        UrlDto urlDto = new UrlDto(url.getOriginalUrl(), url.getShortId());
        return urlDto;
    }
}
