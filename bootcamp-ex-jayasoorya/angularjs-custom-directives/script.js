var app = angular.module("PopupDemo", ['ui.bootstrap']);

app.directive("firstDirective", function () {
  return {
    template: "<span>Click Here For Popup</span>",
  };
});

angular.module("PopupDemo").controller("PopupDemoCont", ["$scope","$modal",function ($scope, $modal) {
    $scope.open = function () {
      console.log("opening pop up");
      var modalInstance = $modal.open({
        templateUrl: "popup.html",
      });
    };
  },
]);
