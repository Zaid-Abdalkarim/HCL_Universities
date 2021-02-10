package com.university.university.repo;

import com.university.university.model.UniversityModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UniversityRepo extends CrudRepository<UniversityModel, Long> {

}
