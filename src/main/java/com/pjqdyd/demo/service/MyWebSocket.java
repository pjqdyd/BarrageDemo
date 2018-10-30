package com.pjqdyd.demo.service;

import org.springframework.stereotype.Component;

import javax.websocket.OnClose;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;
import java.util.concurrent.CopyOnWriteArraySet;

/**
 * websocket业务操作实现类
 */
@Component
@ServerEndpoint("/websocket")
public class MyWebSocket {

    //会话控制,与某个客户端的连接会话
    private Session session;

    //创建一个websocket容器,用于存放各个客户端的websocket.session
    private static CopyOnWriteArraySet<MyWebSocket> webSocketSet = new CopyOnWriteArraySet<>();

    //当有客户前端打开连接时, 把session存入websocket的集合容器中
    @OnOpen
    public void onOpen(Session session){
        this.session = session;
        webSocketSet.add(this);
        System.out.println("[webSocket消息] 有新的连接,总数:" + webSocketSet.size());

    }

    @OnClose
    public void onClose(){
        webSocketSet.remove(this);
        System.out.println("[webSocket消息] 断开连接,总数:" + webSocketSet.size());
    }

    @OnMessage
    public void onMessage(String message){
        System.out.println("[webSocket消息] 收到客户端发来的消息:" + message);
    }

    //定义发送广播消息的方法
    public void sendMessage(String message){
        for(MyWebSocket websocket : webSocketSet){
            try {
                websocket.session.getBasicRemote().sendText(message);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }


}
