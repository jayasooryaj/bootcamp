var app = angular.module('mainApp', []);

app.directive("firstDirective", function(){
    return{
        template: '<span>Click Here</span>'
    };
});