package com.citizens.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Citizen {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column
	private String name;
	
	@Column
	private int vaccinationcenterid;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getVaccinationcenterid() {
		return vaccinationcenterid;
	}

	public void setVaccinationcenterid(int vaccinationcenterid) {
		this.vaccinationcenterid = vaccinationcenterid;
	}

	@Override
	public String toString() {
		return "Citizen [id=" + id + ", name=" + name + ", vaccinationcenterid=" + vaccinationcenterid + "]";
	}
	

}
