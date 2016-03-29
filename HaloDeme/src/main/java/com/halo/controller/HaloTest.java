package com.halo.controller;

import com.alibaba.fastjson.JSON;
import com.halo.base.BaseController;
import com.halo.entity.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

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

    @RequestMapping(value="/json/{id}", method = RequestMethod.POST)
    public @ResponseBody Student jsonInfo(
            @RequestBody Student student,
            @PathVariable Integer id,
            HttpServletResponse response) throws Exception{

        student.setName("徐海然");
        student.setAge(26);
        student.setPrice(BigDecimal.ONE);
        List<Student> list = new ArrayList<Student>();
        for(int i=0; i<10; i++){
            Student obj = new Student();
            obj.setName("徐海然"+i);
            obj.setAge(26+i);
            obj.setPrice(BigDecimal.ONE);
            list.add(obj);
        }
        student.setList(list);
        System.out.print(id);
        System.out.println(JSON.toJSONString(student));
        return student;
    }

}
