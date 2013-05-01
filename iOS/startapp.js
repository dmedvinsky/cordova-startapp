/**
 * Cordova StartApp plugin
 * Author: Dmitry Medvinsky <dmedvinsky@gmail.com>
 * License: MIT/X11
 */
var StartApp = function() { };

StartApp.prototype.start = function(params, success, fail) {
    success = success ? success : function() {};
    fail = fail ? fail : function() {};
    var url = params.ios;
    return cordova.exec(success, fail, 'StartApp', 'start', [url]);
};

window.startapp = new StartApp();
