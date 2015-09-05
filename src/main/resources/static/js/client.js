var mintercom = angular.module('mintercom', ['ngRoute']);

mintercom.config(['$routeProvider', function ($routeProvider) {
        $routeProvider
                .when('/home', {
                    'templateUrl': '/html/home.html',
                    'controller': 'homeCtrl'
                }).otherwise({
                    redirectTo: '/home'
                });
    }]);


polygon.directive('fileModel', ['$parse', function ($parse) {
        return {
            restrict: 'A',
            link: function (scope, element, attrs) {
                var model = $parse(attrs.fileModel);
                var modelSetter = model.assign;

                element.bind('change', function () {
                    scope.$apply(function () {
                        modelSetter(scope, element[0].files[0]);
                    });
                });
            }
        };
    }]);

mintercom.controller('homeCtrl', function ($scope, $rootScope, $http) {
	$scope.applicationName;
	
    $scope.init = function () {
    	$scope.applicationName = 'Intercom-Service - Service at your convenience';
    };

});

