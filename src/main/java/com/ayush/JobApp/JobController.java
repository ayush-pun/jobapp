package com.ayush.JobApp;

import com.ayush.JobApp.model.JobPost;
import com.ayush.JobApp.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JobController {

    @Autowired
    private JobService service;

    @RequestMapping({"/","home"})
    public String home(){
        System.out.println("in the home method");
        return "home";
    }

    @RequestMapping("addjob")
    public String addjob(){
        return "addjob";
    }

    @PostMapping("handleForm")
    public String handleform(JobPost jobpost){
        service.addJobs(jobpost);
        return "success";
    }
}
