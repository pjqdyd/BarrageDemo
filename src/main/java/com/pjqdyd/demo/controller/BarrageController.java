package com.pjqdyd.demo.controller;

import com.pjqdyd.demo.service.MyWebSocket;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

/**
 * 弹幕主页Controller层
 */
@RestController
@RequestMapping("/barrage")
public class BarrageController {
    @Autowired
    private MyWebSocket myWebSocket;

    @GetMapping("/index")
    public ModelAndView index(){
        return new ModelAndView("/index/index");
    }

    @GetMapping("/send")
    public void send(){
        String msg = "Hello EveryOne!";
        myWebSocket.sendMessage(msg);
    }

}
