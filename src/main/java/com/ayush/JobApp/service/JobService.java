package com.ayush.JobApp.service;

import com.ayush.JobApp.model.JobPost;
import com.ayush.JobApp.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {

    @Autowired
    private JobRepo repo;

    public void addJobs(JobPost jobPost){
        repo.addJob(jobPost);
    }

    public List<JobPost> getAllJobs(){
       return repo.getAllJobs();
    }
}
