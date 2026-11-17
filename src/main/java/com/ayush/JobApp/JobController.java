package com.ayush.JobApp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JobController {
    @RequestMapping({"/","home"})
    public String home(){
        System.out.println("in the home method");
        return "home";
    }

    @RequestMapping("addjob")
    public String addjob(){
        return "addjob";
    }
}
