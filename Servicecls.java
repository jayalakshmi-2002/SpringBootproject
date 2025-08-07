package com.example.Databasse.Servicedb;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Databasse.Entitydb.Entitycls;
import com.example.Databasse.Repodb.Repositorydb;

@Service
public class Servicecls {
	@Autowired
    Repositorydb repo;
   public Entitycls method1(Entitycls ed) {
	   return repo.save(ed);
   }
public List<Entitycls>methodservice2(){
	return repo.findAll();
}
public Optional <Entitycls>methodservice3(int s_no){
	return repo.findById(s_no);
}
public Entitycls methodservice4 (Entitycls newdata,int id) {
	Entitycls OldData=repo.findById(id).orElseThrow(()-> new NullPointerException("Id not Found"));
	OldData.setName(newdata.getName());
OldData.setDepart(newdata.getDepart());
OldData.setYear(newdata.getYear());
return repo.save(OldData);
}
public String methodservice5(int id) {
	if(repo.existsById(id)) {
		repo.deleteById(id);
		return "Deleted Successfully";
	}else {
		return "Id is not found";	}
}
}
