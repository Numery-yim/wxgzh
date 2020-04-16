package com.test.wechat.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author liangyehao
 * @version 1.0
 * @date 2020/4/16 21:57
 * @content
 */
@Controller
@RequestMapping("/main")
public class MainController {

    @GetMapping("/resume")
    public ModelAndView resume(){
        return new ModelAndView("index");
    }
}
