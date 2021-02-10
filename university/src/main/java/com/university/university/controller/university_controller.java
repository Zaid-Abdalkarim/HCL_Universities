package com.university.university.controller;

import com.university.university.service.UniversityService;
import com.university.university.model.UniversityModel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;

import java.util.List;

public class university_controller {

    @Autowired
    private UniversityService universityService;

    @GetMapping("/university")
    public List<UniversityModel> allUsers() {

        return universityService.findAll();
    }

    @GetMapping("/university/count")
    public Long count() {

        return universityService.count();
    }

    @DeleteMapping("/university/{id}")
    public void delete(@PathVariable String id) {

        Long universityId = Long.parseLong(id);
        universityService.deleteById(universityId);
    }
}
