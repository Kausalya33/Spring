var app = angular.module("mainApp", []);  
       app.controller('Ctrl', function ($scope) {  
  
           $scope.EmpModel = {  
               Id: 0,  
               Salary: 0,  
               Name: '',
               Address: ''  
           };  
  
           $scope.EmpList = [];  
           $scope.AddData = function () {  
               //alert("Add data");
               var _emp = {  
                   Id: $scope.EmpList.length + 1,  
                   Name: $scope.EmpModel.Name,  
                   Address:$scope.EmpModel.Address,
                   Salary: $scope.EmpModel.Salary  
               };  
               $scope.EmpList.push(_emp);  
               ClearModel();  
           } 
          $scope.UpdateData = function () {  
              //alert("update data");
    $.grep($scope.EmpList, function (e) {  
        if (e.Id == $scope.EmpModel.Id) {  
            e.Name = $scope.EmpModel.Name;  
            e.Address=$scope.EmpModel.Address;
            e.Salary = $scope.EmpModel.Salary;  
        }  
      });
      ClearModel();
          }


           $scope.DeleteData = function (emp) {  
               var _index = $scope.EmpList.indexOf(emp);  
               $scope.EmpList.splice(_index, 1);  
           }   
            $scope.BindSelectedData = function (emp) {
                 $scope.EmpModel.Id = emp.Id;
                 $scope.EmpModel.Name = emp.Name;
                 $scope.EmpModel.Address=emp.Address;
        $scope.EmpModel.Salary = emp.Salary;
 }
  
           function ClearModel() {  
               $scope.EmpModel.Id = 0;  
               $scope.EmpModel.Name = ''; 
               $scope.EmpModel.Address=''; 
               $scope.EmpModel.Salary = 0;  
           }  
          });
         var app = angular.module('mainapp', []);
app.controller('Ctrl', function($scope, $http) {
    $http.get("http://localhost:8080/employee").then(function (response) {
        $scope.myWelcome = response.data;
        console.log($scope.myWelcome);
    });
});
         
            
    

