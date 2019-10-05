package com.rahul.recipeproject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Rahul on 2019-10-03
 */
@Controller
public class IndexController {

    @RequestMapping({"","/","index"})
    public String getIndexPage(){
        System.out.println("Testing dev tools ......");
        return "index";
    }
}
