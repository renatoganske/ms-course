package io.github.renatoganske.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.renatoganske.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long>{

}
