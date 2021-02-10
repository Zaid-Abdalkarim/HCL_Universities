package com.university.university;

import javax.transaction.Transactional;

import com.university.university.model.UniversityModel;
import com.university.university.repo.UniversityRepo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Runner implements CommandLineRunner {

    private static final Logger logger = LoggerFactory.getLogger(Runner.class);

    @Autowired
    private UniversityRepo universityRepo;

    @Override
    @Transactional
    public void run(String... args) throws Exception {

        logger.info("initializing universities");

        var u1 = new UniversityModel("YALE");
        universityRepo.save(u1);

        var u2 = new UniversityModel("USC");
        universityRepo.save(u2);

        var u3 = new UniversityModel("STANFORD");
        universityRepo.save(u3);
    }
}
