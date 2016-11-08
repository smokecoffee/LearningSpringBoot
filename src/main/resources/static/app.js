var myApp = angular.module('myApp', ['leaflet-directive']);

myApp.controller('mainController', ['$scope', '$filter',  '$timeout','leafletMarkerEvents','leafletMapEvents', '$http',
    function ($scope, $filter, $timeout,leafletMarkerEvents,leafletMapEvents, $http) {
    $scope.markers = [];
    /* DEFINE $SCOPE VARIABLES */
    
    $scope.icons = {
        
        trip1: {
            type: 'div',
            iconSize: [20, 20],
            className: 'trip1',
            iconAnchor:  [20, 20],
            focus:true,
            click:true,
            logic: 'emit'
        },
        trip2: {
            type: 'div',
            iconSize: [20, 20],
            className: 'trip2',
            iconAnchor:  [20, 20],
            logic: 'emit'
        }
    };
    $http.get('/canDetailDataApi').then(function(response) {
    	var array = response.data;

        angular.forEach(array, function(value, i) {
            var yyddmm = new Date(value.testYyddmm + " " + value.testHhmmss);

            var hh = yyddmm.getHours();

            var tmp ={
            	 layer: 'trip1',
                 lat: value.mapLatitude,
                 lng: value.mapLongitude,
                 focus: true,
                 click:true,
                 timestamp:{
                     month:yyddmm.getMonth() + 1,
                     day:yyddmm.getDate(),
                     hour:yyddmm.getHours(),
                     minute:yyddmm.getMinutes(),
                     second:yyddmm.getMilliseconds()
                 },
                 icon: $scope.icons.trip1
            }
            $scope.markers.push(tmp);
            
        });
    });
    
    // DEFINE ARRAY OBJECTS OF MARKER     
    $scope.markers2 =  [

        {
            layer: 'trip1',
            lat: 35.663296,
            lng: 139.73235,
            focus: true,
            click:true,
            timestamp:{
                month:10,
                day:13,
                hour:16,
                minute:04,
                second:25
            },
            icon: $scope.icons.trip1
        },
        {
            layer: 'trip1',
            lat: 35.663414,
            lng: 139.732595,
            focus: true,
            click:true,
            timestamp:{
                month:10,
                day:13,
                hour:16,
                minute:04,
                second:55
            },

            icon: $scope.icons.trip1
        },
        {
            layer: 'trip1',
            lat: 35.663532,
            lng: 139.73284,
            focus: true,
            click:true,
            timestamp:{
                month:10,
                day:13,
                hour:16,
                minute:05,
                second:20
            },
            icon: $scope.icons.trip1
        },                              
        {
            layer: 'trip1',
            lat: 35.66365,
            lng: 139.733085,
            focus: true,
            click:true,
            timestamp:{
                month:10,
                day:13,
                hour:16,
                minute:05,
                second:40
            },
            icon: $scope.icons.trip1
        },                              
        {
            layer: 'trip1',
            lat: 35.663768,
            lng: 139.73333,
            focus: true,
            click:true,
            timestamp:{
                month:10,
                day:13,
                hour:16,
                minute:04,
                second:25
            },
            icon: $scope.icons.trip1
        },                              
        {
            layer: 'trip1',
            lat: 35.663886,
            lng: 139.733575,
            focus: true,
            timestamp:{
                month:10,
                day:13,
                hour:16,
                minute:04,
                second:25
            },
            icon: $scope.icons.trip1
        },                              
        {
            layer: 'trip1',
            lat: 35.664004,
            lng: 139.73382,
            focus: true,
            timestamp:{
                month:10,
                day:13,
                hour:16,
                minute:04,
                second:25
            },
            icon: $scope.icons.trip1
        },                              
        {
            layer: 'trip1',
            lat: 35.664122,
            lng: 139.734065,
            focus: true,
            timestamp:{
                month:10,
                day:13,
                hour:16,
                minute:04,
                second:25
            },
            icon: $scope.icons.trip1
        },                              
        {
            layer: 'trip1',
            lat: 35.66424,
            lng: 139.73431,
            focus: true,
            timestamp:{
                month:10,
                day:13,
                hour:16,
                minute:04,
                second:25
            },
            icon: $scope.icons.trip1
        },                              
        {
            layer: 'trip1',
            lat: 35.664358,
            lng: 139.734555,
            //message:'Trip1終了地点',
            focus: true,
            timestamp:{
                month:10,
                day:13,
                hour:16,
                minute:04,
                second:25
            },
            icon: $scope.icons.trip1
        },
        {
            layer: 'trip2',
            lat: 35.66359,
            lng: 139.735221,
            //message:'Trip2開始地点',
            focus: true,
            timestamp:{
                month:10,
                day:13,
                hour:16,
                minute:04,
                second:25
            },
            icon: $scope.icons.trip2
        },
        {
            layer: 'trip2',
            lat: 35.66367,
            lng: 139.735229,
            focus: true,
            timestamp:{
                month:10,
                day:13,
                hour:16,
                minute:04,
                second:25
            },
            icon: $scope.icons.trip2
        },
        {
            layer: 'trip2',
            lat: 35.66375,
            lng: 139.735237,
            focus: true,
            timestamp:{
                month:10,
                day:13,
                hour:16,
                minute:04,
                second:25
            },
            icon: $scope.icons.trip2
        },
        {
            layer: 'trip2',
            lat: 35.66383,
            lng: 139.735245,
            focus: true,
            timestamp:{
                month:10,
                day:13,
                hour:16,
                minute:05,
                second:25
            },
            icon: $scope.icons.trip2
        },
        {
            layer: 'trip2',
            lat: 35.66391,
            lng: 139.735253,
            focus: true,
            timestamp:{
                month:10,
                day:13,
                hour:16,
                minute:05,
                second:55
            },
            icon: $scope.icons.trip2
        },
        {
            layer: 'trip2',
            lat: 35.66399,
            lng: 139.735261,
            focus: true,
            timestamp:{
                month:10,
                day:13,
                hour:16,
                minute:06,
                second:25
            },
            icon: $scope.icons.trip2
        },
        {
            layer: 'trip2',
            lat: 35.66407,
            lng: 139.735269,
            focus: true,
            timestamp:{
                month:10,
                day:13,
                hour:16,
                minute:06,
                second:55
            },
            icon: $scope.icons.trip2
        },
        {
            layer: 'trip2',
            lat: 35.66415,
            lng: 139.735277,
            focus: true,
            timestamp:{
                month:10,
                day:13,
                hour:16,
                minute:07,
                second:15
            },
            icon: $scope.icons.trip2
        },
        {
            layer: 'trip2',
            lat: 35.66423,
            lng: 139.735285,
            focus: true,
            timestamp:{
                month:10,
                day:13,
                hour:16,
                minute:07,
                second:50
            },
            icon: $scope.icons.trip2
        },
        {
            layer: 'trip2',
            lat: 35.66431,
            lng: 139.735293,
            focus: true,
            timestamp:{
                month:10,
                day:13,
                hour:16,
                minute:08,
                second:30
            },
            icon: $scope.icons.trip2
        }      
    ];
        
    $scope.definedLayers = {
        
        osm: {
            name: 'OpenStreetMap',
            type: 'xyz',
            visible: true,
            url: 'http://{s}.tile.openstreetmap.org/{z}/{x}/{y}.png',
        }
    };
        
    $scope.definedOverlays = {
        
        kokudoTiriMap: {
            name: 'KokudoTiriMap',
            type: 'xyz',
            visible: false,
            url: 'http://cyberjapandata.gsi.go.jp/xyz/std/{z}/{x}/{y}.png'
        },

        bingAerial: {
            name: 'Bing Aerial',
            type: 'bing',
            visible: false,
            key: 'Aj6XtE1Q1rIvehmjn2Rh1LR2qvMGZ-8vPS9Hn3jCeUiToM77JFnf-kFRzyMELDol',
            layerOptions: {
                type: 'Aerial'
            }
        },
      
        trip1: {
            type: 'group',
            name: 'trip1',
            visible: false
        },

        trip2: {
            type: 'group',
            name: 'trip2',
            visible: false
        }
    };
        
    $scope.definedCenter = {
        lat: 35.663553,
        lng: 139.733769,
        zoom: 500
    };
        
    $scope.events = {
        markers: {
            // make all markers' events 'enable'
            enable: leafletMarkerEvents.getAvailableEvents(),
            logic: 'emit'
        },

        map:{
            // make all map's events 'disable'
            disable: leafletMapEvents.getAvailableMapEvents(),
        }
    };
    
    angular.extend($scope, {
        
        // set basiclayers and custom layers
        layers: {
            
            // Basic Layers
            baselayers: {
                osm: $scope.definedLayers.osm
            },
            
            // Set custom layers
            overlays: {
                kokudoTiriMap: $scope.definedOverlays.kokudoTiriMap,
                bingAerial: $scope.definedOverlays.bingAerial,  
                trip1: $scope.definedOverlays.trip1,
                trip2: $scope.definedOverlays.trip2
            },
        },
                
        // set the center at "Hotel The Bee Roppongi" 
        center: $scope.definedCenter,
    
        brakeIcon: {
            iconUrl: 'images\\brake.png',
            iconRetinaUrl:'images\\brake.png',
            iconSize:     [20, 20], // size of the icon
            //shadowSize:   [50, 64], // size of the shadow
            iconAnchor:   [22, 94], // point of the icon which will correspond to marker's location
            shadowAnchor: [4, 62],  // the same for the shadow
            popupAnchor:  [-3, -76], // point from which the popup should open relative to the iconAnchor
        },

        straightIcon: {
            iconUrl: 'images\\straight.png',
            iconRetinaUrl:'images\\straight.png',
            iconSize:     [20, 20],
            //shadowSize:   [50, 64],
            iconAnchor:   [22, 94],
            shadowAnchor: [4, 62],
            popupAnchor:  [-3, -76], // point from which the popup should open relative to the iconAnchor
        },

        defaults: {
            scrollWheelZoom: false
        },
        
    });
    
    /* DEFINE FUNCTION */
        
    // Events listener Function
    $scope.eventDetected = "No events yet...";

    var markerEvents = leafletMarkerEvents.getAvailableEvents();
    for (var k in markerEvents){
        var eventName = 'leafletDirectiveMarker.viewMap.' + markerEvents[k];

        $scope.$on(eventName, function(event, args){
            $scope.eventDetected = event.name;
        });
    }

    // 'click' Event Function(all markers)
    $scope.$on('leafletDirectiveMarker.viewMap.click', function (event, args) {
        
        // The program cannnot figure out which marker is clicked
        var responseTime = $scope.markers[0].timestamp.minute + "分" + $scope.markers[0].timestamp.second + "秒";

        window.open('open.html?' + responseTime,'動画再生ページ');
    });
        
    // ToggleTrip Function(visible or invisible)
    $scope.toggleTrip = function(type){
        
        $scope.layers.overlays[type].visible = !$scope.layers.overlays[type].visible;
        console.log("$scope.layers.overlays[type].visible: " + $scope.layers.overlays[type].visible);
    };
    
    // Change Icons Function
    $scope.changeIcons = function(iconName){
    	
        angular.forEach($scope.markers, function(marker, i) {
            console.log("marker.icon: " +  JSON.stringify(marker.icon));
            
            $scope.markers[i].icon = iconName;
        });
    };

    // Download KML File Function
    $scope.handleDownload = function(){

        $scope.coordinates = new Array();
                
        for (var m in $scope.markers) {

            var array = [$scope.markers[m].lng,$scope.markers[m].lat];
            $scope.coordinates.push(array);
        }

        var geoJson = {

            "type": "Feature",
            "properties": {
                "name":"TripXXX(LineString Version)"
            },

            /* Create Point Version
            "geometry": {
                "type": "Point",
                "coordinates": $scope.coordinates
            }
            */

            // Create LineString Version
            "geometry": {
                "type": "LineString",
                "coordinates": $scope.coordinates
            }
        };

        // convert geoJson to kml
        var kml = tokml(geoJson);

        // confirm a KML File
        console.log("KMLファイル: " + kml);

        var target = document.getElementById('dlKml');
        target.href = 'data:text/xml;charset=utf-8,'+ encodeURIComponent(kml);
        target.setAttribute('download','test.kml');
    }
}]);


/* OTHER USELESS COMPONENTS */

/* Change Layer Function(Not Working)
$scope.toggleLayer = function(layerName){

    console.log("layerName: " + layerName);

    var baselayers = $scope.layers.baselayers;

    console.log("Before:baselayers: " + JSON.stringify(baselayers));

    // DELETE BASE LAYERS FROM MAP
    // delete baselayers['osm'];

    baselayers = $scope.definedOverlays[layerName];

    console.log("After:baselayers: " + JSON.stringify(baselayers['osm']));
};
*/

/*
// NO USE VERSION OF ANGULAR 1.3.0
function initmap(){

    var map = L.map('viewMap');
    
    // OpenStreetMapレイヤー
    L.tileLayer(
        'http://{s}.tile.openstreetmap.org/{z}/{x}/{y}.png',
        {
            attribution: 'Map data &copy; <a href="http://openstreetmap.org">OpenStreetMap</a>',
        }
    ).addTo(map);
    
    // another Layer
    L.tileLayer(
        'http://cyberjapandata.gsi.go.jp/xyz/std/{z}/{x}/{y}.png',
        {
            attribution: "<a href='http://www.gsi.go.jp/kikakuchousei/kikakuchousei40182.html' target='_blank'>国土地理院</a>"
        }
    ).addTo(map);
    
    var sampleIcon = L.icon({
    iconUrl: 'images/straight.png',
    iconRetinaUrl: 'images/straight.png',
    iconSize: [20, 20],
    iconAnchor: [25, 50],
    popupAnchor: [0, -50],
    });
    
    // 開始地点を適当な場所に設定
    var longitude = 35.663296;
    var latitude = 139.732350;

    for (var i = 0, len = 20; i < len; i++) {

        var mapMarker = 
        L.marker([longitude,latitude], { icon: sampleIcon })
        .on('click', onClick)
        .addTo(map);
        
        // convert marker to geojson
        // layers also have a toGeoJSON function
        var json = mapMarker.toGeoJSON();
        // then export to kml
        var kml = tokml(json);
        
        longitude += 0.000118;
        latitude += 0.000245;
    }
    //　ログ確認
    console.log(kml);

    map.setView([35.65863174,139.74542444], 14);
    map.setView([35.664822,139.736087], 500);   
}
// 実行
initmap();
*/

/* CAN DATA SAMPLE
$scope.candata = function(){

    test001:{
        // フレームNo
        test_id : 030512,
        // フレームNo
        frame_no : 0,
        // ロール角速度
        roll_angular_velocity: 0.046,
        // ピッチ角速度
        pitch_angular_velocity : false,
        // ヨー角速度
        yo_angular_velocity : false,
        // 加速度X
        accelerateX : -0.1018,
        // 加速度Y
        accelerateY : -0.5218,
        // 加速度Z
        accelerateZ : 10.0233,
        // ロール角度
        roll_angle: 4.31,
        // ピッチ角度
        pitch_angle : -0.18,
        // ヨー角度
        yo_angle : -0.63,
        // GPS経度
        gps_longitude : 140.1552,
        // GPS緯度
        gps_latitude : 34.04763,
        // GPS速度
        gps_latitude : 0,
        // GPS方位
        gps_latitude : 336.099,
        // GPS高度
        gps_latitude : 64,
        // GPS測位
        gps_satelite : 6,
        // GPS誤差
        gps_error : 3
    };
}
*/

/* forEach example of angular1.3
angular.forEach($scope.markers, function(marker, i) {

    console.log("markerStr: " +  JSON.stringify(marker));

    $scope.$on(marker.click, function(event){
        console.log(event.name);
    });
});
*/


