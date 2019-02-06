# BarrageDemo
##利用springboot+websocket+jquery简单模拟实时弹幕功能

-启动项目后,访问localhost:8080/barrage/index即可在已连接websocket的页面发送实时弹幕了

(前端代码在src/resource下的static和templates,这里就没有前后分离,用了freemarker模板,通过访问url返回主页index.ftl(index.html))

(如果是在局域网内的不同设备之间发送弹幕,需要在application.properties修改服务启动的ip为本机ip, webs.js连接websocket的ip也为同一ip,
 然后其他电脑/手机访问 服务启动ip:8080/barrage/index就也能发实时弹幕了)
 
 ###演示: 
 </br>
 ![演 示](https://github.com/pjqdyd/BarrageDemo/blob/master/demoGif/barrageDemo.gif)
 
 ###控制台信息:
 </br>
 ![控制台信息](https://github.com/pjqdyd/BarrageDemo/blob/master/demoGif/info.jpg)
