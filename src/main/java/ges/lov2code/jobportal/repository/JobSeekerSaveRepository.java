package ges.lov2code.jobportal.repository;

import ges.lov2code.jobportal.entity.JobPostActivity;
import ges.lov2code.jobportal.entity.JobSeekerProfile;
import ges.lov2code.jobportal.entity.JobSeekerSave;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JobSeekerSaveRepository extends JpaRepository<JobSeekerSave, Integer> {

    public List<JobSeekerSave> findByUserId(JobSeekerProfile userAccountId);

    List<JobSeekerSave> findByJob(JobPostActivity job);

}
