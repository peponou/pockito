package com.urlshortener.pockito.service;

import com.urlshortener.pockito.model.URLEntity;
import com.urlshortener.pockito.repository.UrlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UrlService {
    @Autowired
    private UrlRepository urlRepository;
    //Create operation
    public URLEntity saveUrl(String originalUrl) {
        return urlRepository.save(new URLEntity(originalUrl));
    }
    //Retrieve operation
    public URLEntity getByOriginalUrl(String originalUrl) {
        return urlRepository.findByOriginalUrl(originalUrl);
    }

    public URLEntity getByShortId(String shortId) {
        return urlRepository.findByShortId(shortId);
    }

    //Update operation
    public URLEntity update(String originalUrl, String shortId) {
        URLEntity urlEntity = urlRepository.findByShortId(shortId);
        urlEntity.setOriginalUrl(originalUrl);
        urlEntity.setShortId(shortId);
        return urlRepository.save(urlEntity);
    }
    //Delete operation
    public void deleteAll() {
        urlRepository.deleteAll();
    }

//    public String shortenURL(String longURL) {
//        String shortURL = "";
//        if (validateURL(longURL)) {
//            longURL = sanitizeURL(longURL);
//            if (getByOriginalUrl(longURL).getOriginalUrl().equalsIgnoreCase(longURL)) {
//                shortURL = domain + "/" + valueMap.get(longURL);
//            } else {
//                shortURL = domain + "/" + getKey(longURL);
//            }
//        }
//        // add http part
//        return shortURL;
//    }

//    public String expandURL(String shortURL) {
//        String longURL;
//        String key = shortURL.substring(domain.length() + 1);
//        longURL = keyMap.get(key);
//        return longURL;
//    }

    String sanitizeURL(String url) {
        if (url.substring(0, 7).equals("http://"))
            url = url.substring(7);

        if (url.substring(0, 8).equals("https://"))
            url = url.substring(8);

        if (url.charAt(url.length() - 1) == '/')
            url = url.substring(0, url.length() - 1);
        return url;
    }

    // Validate URL
    // not implemented, but should be implemented to check whether the given URL
    // is valid or not
    boolean validateURL(String url) {
        return true;
    }

}
