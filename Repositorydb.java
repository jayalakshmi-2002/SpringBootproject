package com.example.Databasse.Repodb;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Databasse.Entitydb.Entitycls;

public interface Repositorydb extends JpaRepository<Entitycls,Integer> {

}
