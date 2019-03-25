'use strict'

angular.module('demo.services', []).factory('UrlService',
		[ "$http", "CONSTANTS", function($http, CONSTANTS) {
			var service = {};
			service.getOriginalUrl = function(shortId) {
				var url = CONSTANTS.getUrlByShortId + shortId;
				return $http.get(url);
			}
			service.saveUrl = function(urlDto) {
				return $http.post(CONSTANTS.saveUrl, urlDto);
			}
			return service;
		} ]);