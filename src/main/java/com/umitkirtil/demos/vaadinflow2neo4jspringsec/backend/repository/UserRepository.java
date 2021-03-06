package com.umitkirtil.demos.vaadinflow2neo4jspringsec.backend.repository;

import com.umitkirtil.demos.vaadinflow2neo4jspringsec.backend.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository
@Transactional
public interface UserRepository extends JpaRepository<User, Long> {

    User findUserByEmail(String email);
}
