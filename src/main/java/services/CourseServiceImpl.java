package services;

import models.Course;
import repositories.CourseRepository;

import java.util.List;

public class CourseServiceImpl implements CourseService {

    private final CourseRepository courseRepository;

    public CourseServiceImpl(CourseRepository courseRepository){
        this.courseRepository = courseRepository;
    }



    @Override
    public void save(Course course) {

    }

    @Override
    public Course findById(long Id) {
        return courseRepository.findById(Id);
    }

    @Override
    public void deleteById(long Id) {
        courseRepository.deleteById(Id);
    }

    @Override
    public List<Course> findAll() {
        return courseRepository.findAll();
    }
}