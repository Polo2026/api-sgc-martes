package services;

import models.Enrollment;
import repositories.EnrollmentRepository;

public class EnrollmentServiceImpl implements EnrollmentService {

    private final EnrollmentRepository enrollmentRepository;

    public EnrollmentServiceImpl(EnrollmentRepository enrollmentRepository){
        this.enrollmentRepository = enrollmentRepository;
    }

    @Override
    public void save(Enrollment enrollment) {
        enrollmentRepository.save(enrollment);
    }



    @Override
    public Enrollment findById(long Id) {
        return enrollmentRepository.findById(Id);
    }

    @Override
    public void deleteById(long Id) {
        enrollmentRepository.deleteById(Id);
    }

    @Override
    public List<Enrollment> findAll() {
        return enrollmentRepository.findAll();
    }
}
