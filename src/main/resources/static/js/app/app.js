'use strict'

var demoApp = angular.module('demo', [ 'ui.bootstrap', 'demo.controllers',
		'demo.services' ]);
demoApp.constant("CONSTANTS", {
	getUrlByShortId : "/url/getUrl/",
	saveUrl : "/url/saveUrl"
});