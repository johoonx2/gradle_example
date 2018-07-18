package com.ai.bpnn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class mainController {
    @GetMapping("/")
    public ModelAndView main(ModelAndView mav){
        mav.addObject("value", "Main!");
        mav.setViewName("/main");
        return mav;
    }
}
