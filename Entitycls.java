package com.example.Databasse.Entitydb;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Student_Data")
public class Entitycls {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	@Column(name="s_no")
	private int s_no;
	@Column(name="st_name")
	private String name;
	@Column(name="st_depart")
	private String depart;
	@Column(name="st_year")
	private String year;
	public int getS_no() {
		return s_no;
	}
	public void setS_no(int s_no) {
		this.s_no = s_no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepart() {
		return depart;
	}
	public void setDepart(String depart) {
		this.depart = depart;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	

}
