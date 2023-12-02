package com.citizens.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.citizens.Entity.Citizen;

public interface CitizenRepository extends JpaRepository<Citizen, Integer> {
	
	public List<Citizen> findByVaccinationCenterId(int id);

}
