package com.citizens.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.citizens.Entity.Citizen;

@EnableJpaRepositories
public interface CitizenRepository extends JpaRepository<Citizen, Integer> {
	
	public List<Citizen> findByvaccinationcenterid(int id);

}
