package com.halo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by n551 on 2016/3/25.
 */
@Controller
@RequestMapping(value="/halotest")
public class HaloTest {

    public ModelAndView info(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("halo","徐海然");
        modelAndView.setViewName("main");
        return  modelAndView;
    }

}
