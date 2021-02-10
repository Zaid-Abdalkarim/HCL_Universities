package com.university.university.service;

import com.university.university.model.UniversityModel;
import com.university.university.repo.UniversityRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UniversityService {

    @Autowired
    private UniversityRepo universityRepo;

    public List<UniversityModel> findAll() {
        var it = universityRepo.findAll();

        var universities = new ArrayList<UniversityModel>();
        it.forEach(e -> universities.add(e));

        return universities;
    }

    public Long count() {
        return universityRepo.count();
    }

    public void deleteById(Long universityId) {
        universityRepo.deleteById(universityId);
    }
}
