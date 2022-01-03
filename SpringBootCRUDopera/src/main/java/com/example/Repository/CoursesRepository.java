package com.example.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.Entity.Courses;

public interface CoursesRepository extends JpaRepository <Courses, Long>{

}
