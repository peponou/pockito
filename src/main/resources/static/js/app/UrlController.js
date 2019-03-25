'use strict'

var module = angular.module('demo.controllers', []);
module.controller("UrlController", [ "$scope", "UrlService",
		function($scope, UrlService) {

			$scope.urlDto = {
				url : null,
				shortId : null
			};
			
			// UrlService.getOriginalUrl(1).then(function(value) {
			// 	console.log(value.data);
			// }, function(reason) {
			// 	console.log("error occurred");
			// }, function(value) {
			// 	console.log("no callback");
			// });

			$scope.saveUrl = function() {
				UrlService.saveUrl($scope.urlDto).then(
				function() {
					console.log("works");
					$scope.urlDto = {
						url : null,
						shortId : null
					};
				}, function(reason) {
					console.log("error occurred");
				}, function(value) {
					console.log("no callback");
				});
			}
		} ]);