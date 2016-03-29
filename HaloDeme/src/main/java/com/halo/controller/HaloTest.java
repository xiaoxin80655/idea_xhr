package com.halo.controller;

import com.halo.base.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by n551 on 2016/3/25.
 */
@Controller
@RequestMapping(value="/halotest")
public class HaloTest extends BaseController {

    @RequestMapping
    public ModelAndView info() throws Exception{
        ModelAndView mv = this.getModelAndView();
        mv.addObject("halo","徐海然");
        mv.setViewName("main");
        System.out.println("测试测试测试提交");
        return  mv;
    }

    @RequestMapping(value="/json")
    public ModelAndView jsonInfo() throws Exception{
        ModelAndView mv = this.getModelAndView();
        mv.addObject("halo","徐海然");
        mv.setViewName("main");
        System.out.println("测试测试测试提交");

        return  mv;
    }

}
