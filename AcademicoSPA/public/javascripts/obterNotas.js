var app = angular.module('academicoSPA', []);
app.controller('ObterNotas', ObterNotas);

function ObterNotas($scope, $http) {
    $http.get('http://localhost:8080/AcademicoSPARestful/academico/obternotas').
        success(function(data) {
            $scope.alunoNotas = data;
        }).error(function(data, status, headers, config) {
			alert( "Servidor fora.");
		});
}