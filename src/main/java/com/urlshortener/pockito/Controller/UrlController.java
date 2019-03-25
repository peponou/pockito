package com.urlshortener.pockito.Controller;

import com.urlshortener.pockito.converter.UrlConverter;
import com.urlshortener.pockito.dto.UrlDto;
import com.urlshortener.pockito.model.URLEntity;
import com.urlshortener.pockito.repository.UrlRepository;
import com.urlshortener.pockito.utils.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class UrlController {

    @Autowired
    private UrlRepository urlRepository;

    @RequestMapping(value = Constants.GET_URL_BY_SHORTID, method = RequestMethod.GET)
    public UrlDto getUrlByShortId(@PathVariable ("short_id")String shortId) {
        return UrlConverter.entityToDto(urlRepository.findByShortId(shortId));
    }
    @RequestMapping(value = "/", method = RequestMethod.POST)
    public URLEntity save(@Valid @RequestBody URLEntity urlEntity) {
        urlEntity.setShortId(urlEntity.getShortId());
        urlEntity.setOriginalUrl(urlEntity.getOriginalUrl());
        urlRepository.save(urlEntity);
        return urlEntity;
    }


}
