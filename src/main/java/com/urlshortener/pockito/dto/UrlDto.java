package com.urlshortener.pockito.dto;

public class UrlDto {
    String url;
    String shortId;

    public UrlDto(String url, String shortId) {
        this.url = url;
        this.shortId = shortId;
    }

    public UrlDto() {
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getShortId() {
        return shortId;
    }

    public void setShortId(String shortId) {
        this.shortId = shortId;
    }
}
