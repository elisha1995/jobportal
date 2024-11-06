package ges.lov2code.jobportal.repository;

import ges.lov2code.jobportal.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users, Integer> {
}
