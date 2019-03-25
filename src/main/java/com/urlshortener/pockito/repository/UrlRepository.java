package com.urlshortener.pockito.repository;

import com.urlshortener.pockito.model.URLEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UrlRepository extends MongoRepository<URLEntity, String> {
    URLEntity findByOriginalUrl(String originalUrl);

    URLEntity findByShortId(String shortId);



}
