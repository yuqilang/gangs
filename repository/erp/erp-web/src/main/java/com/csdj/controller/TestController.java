package com.csdj.controller;

import com.csdj.pojo.BookInfo;
import com.csdj.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class TestController {


    @Autowired
    TestService testService;


    @RequestMapping("/getshow")
    public String getshow(Model model){
        List<BookInfo> list=testService.getemplist();
        model.addAttribute("list",list);
        return "index";
    }


}
