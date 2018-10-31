
var websocket = null;

if('WebSocket' in window){
    websocket = new WebSocket('ws://127.0.0.1:8080/websocket');
}else{
    alert('该浏览器不支持websocket!');
}

websocket.onopen = function (event) {
    console.log('建立连接');
}

websocket.onclose = function (event) {
    console.log('连接关闭');
}

websocket.onmessage = function (event) {
    console.log('消息:'+event.data);
}

websocket.onerror = function (event) {
    alert('websocket通信错误!');
}

window.onbeforeunload = function () {

    websocket.close();
}

