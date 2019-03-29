package com.example.pachong.TT.Controller;

import com.example.pachong.TT.Pojo.Blogs;
import com.example.pachong.TT.Service.TTService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class HelloSpringBootController {

    @RequestMapping("/hello")
    public String hello() {
        return "Hello Spring Boot";
    }

    @Autowired
    TTService ttService;

    @RequestMapping(value="/ttt")
    //index 代表活动场次
    public List<Blogs> winningWordsPublished(){
        try {
            return ttService.getAllBlogs();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
