var app = angular.module("NoteManager", []);

// Controller Part
app.controller("NoteController", function($scope, $http) {

    $scope.notes = [];

    $scope.noteForm = {
        noteid: -1,
        notenote: "",
        notedone: 0,
        notedate: 0,
        noteselect: ""
    };

    $scope.choiseArray = [];
    $scope.choiseArray.push({name:"Все"});
    $scope.choiseArray.push({name:"Сделано"});
    $scope.choiseArray.push({name:"В работе"});
    $scope.selectedChoise = $scope.choiseArray[0];

    $scope.choiseDateArray = [];
    $scope.choiseDateArray.push({name:"Старые"});
    $scope.choiseDateArray.push({name:"Новые"});
    $scope.selectedChoiseDate = $scope.choiseDateArray[1];

    $scope.selectedChoise2;
    $scope.selectedChoise3;


    _refreshNoteData();


    $scope.myDateFunction = function(date) {
        return new Date(date)
    };


    $scope.submitNote = function() {

        var method = "";
        var url = "";


        if($scope.noteForm.notenote !== "") {

            if ($scope.noteForm.noteid == -1) {
                method = "POST";
                url = '/noteController';
            } else {
                method = "PUT";
                url = '/noteController/' + $scope.noteForm.noteid;
            }

            $http({
                method: method,
                url: url,
                data: angular.toJson($scope.noteForm),
                headers: {
                    'Content-Type': 'application/json'
                }
            }).then(_success, _error);

        }
    };


    $scope.createNote = function() {
        _clearFormData();
    }


    $scope.deleteNote = function(note) {
        $http({
            method: 'DELETE',
            url: '/noteController/' + note.noteid
        }).then(_success, _error);
    };


    $scope.editNote = function(note) {
        $scope.noteForm.noteid = note.noteid;
        $scope.noteForm.notenote = note.notenote;
        $scope.noteForm.notedone = note.notedone;
        $scope.noteForm.notedate = note.notedate;
    };


    function _refreshNoteData() {
        $http({
            method: 'GET',
            url: '/noteController'
        }).then(
            function(res) { // success
                $scope.notes = res.data;
                _noteSort();
            },
            function(res) { // error
                console.log("Error: " + res.status + " : " + res.data);
            }
        );

    }


    function _success(res) {
        _refreshNoteData();
        _clearFormData();
    }


    function _error(res) {
        var data = res.data;
        var status = res.status;
        var header = res.header;
        var config = res.config;
        alert("Error: " + status + ":" + data);
    }



    function _clearFormData() {
        $scope.noteForm.noteid = -1;
        $scope.noteForm.notenote = "";
        $scope.noteForm.notedone = 0;
        $scope.noteForm.notedate = 0;
        $scope.noteForm.noteselect = "";
    };



    $scope.selectedSole = function() {

        if($scope.selectedChoise.name === "Сделано") {
            $scope.selectedChoise2=true;
        } else if($scope.selectedChoise.name === "В работе") {
            $scope.selectedChoise2=false;
        } else if($scope.selectedChoise.name === "Все") {
            $scope.selectedChoise2 = undefined;
        }

        _refreshNoteData();

    };


    $scope.selectedSoleDate = function() {
        if($scope.selectedChoiseDate.name === "Старые") {$scope.selectedDateChoise=true}
        if($scope.selectedChoiseDate.name==="Новые") {$scope.selectedDateChoise=false}
    };


    function _noteSort() {

        console.log("$scope.selectedChoise2 = " + $scope.selectedChoise2);
        console.log("$scope.notes.length = " + $scope.notes.length);

        if($scope.selectedChoise2 === true) {
            $scope.notesTmp = [];
            for (var i = 0; i < $scope.notes.length; i++) {
                if ($scope.notes[i].notedone === $scope.selectedChoise2) {
                    $scope.notesTmp.push($scope.notes[i]);
                }
            }
            $scope.notes = $scope.notesTmp;
        }


        else {
            if ($scope.selectedChoise2 == false) {
                $scope.notesTmp = [];
                for (var i = 0; i < $scope.notes.length; i++) {
                    if ($scope.notes[i].notedone == $scope.selectedChoise2) {
                        $scope.notesTmp.push($scope.notes[i]);
                    }
                }
                $scope.notes = $scope.notesTmp;
            }
        }

        $scope.currentPage = 0;

    }



    // ALL
    $scope.currentPage = 0;
    $scope.itemsPerPage = 10;

    $scope.firstPage = function() {
        return $scope.currentPage === 0;
    };

    $scope.lastPage = function() {
        var lastPageNum = Math.ceil($scope.notes.length / $scope.itemsPerPage - 1);
        return $scope.currentPage == lastPageNum;
    };

    $scope.numberOfPages = function(){
        return Math.ceil($scope.notes.length / $scope.itemsPerPage);
    };

    $scope.startingItem = function() {
        return $scope.currentPage * $scope.itemsPerPage;
    };

    $scope.pageBack = function() {
        $scope.currentPage = $scope.currentPage - 1;
    };

    $scope.pageForward = function() {
        $scope.currentPage = $scope.currentPage + 1;
    }

});


app.filter('startFrom', function(){
    return function(input, start){
        start = +start;
        return input.slice(start);
    }

});

