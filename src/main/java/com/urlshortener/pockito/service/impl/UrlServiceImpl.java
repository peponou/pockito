//package com.urlshortener.pockito.service.impl;
//
//import com.urlshortener.pockito.converter.UrlConverter;
//import com.urlshortener.pockito.dto.UrlDto;
//import com.urlshortener.pockito.repository.UrlRepository;
//import com.urlshortener.pockito.service.UrlService;
//import org.springframework.beans.factory.annotation.Autowired;
//
//public class UrlServiceImpl implements UrlService {
//    @Autowired
//    UrlRepository urlRepository;
//
//    @Override
//    public UrlDto getUrlByShortId(String shortId) {
//        return UrlConverter.entityToDto(urlRepository.findAll());
//    }
//
//    @Override
//    public void saveUrl(UrlDto urlDto) {
//        urlRepository.insert(urlDto);
//    }
//
//}