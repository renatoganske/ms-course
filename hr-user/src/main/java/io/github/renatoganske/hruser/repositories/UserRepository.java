package io.github.renatoganske.hruser.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.renatoganske.hruser.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

	User findByEmail(String email);
}
