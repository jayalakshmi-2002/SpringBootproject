package com.example.Databasse.Controllerdb;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Databasse.Entitydb.Entitycls;
import com.example.Databasse.Servicedb.Servicecls;
@RequestMapping("/Greeting")
@RestController("/rpwelcome")
public class Controllercls {
@Autowired
Servicecls sc; 

@PostMapping("/gets")
public Entitycls method1(@RequestBody Entitycls ed) {
	return sc.method1(ed);
}

@GetMapping("/calls")
public List<Entitycls> method2() {
	return sc.methodservice2();
}
@GetMapping("call/{ids}")
public Optional<Entitycls> getDataById(@PathVariable("ids")int ids){
	return sc.methodservice3(ids);
}
@PutMapping("/update/{data}")
public Entitycls method3(@RequestBody Entitycls edd,@PathVariable(value="data")int id)
{
	return sc.methodservice4(edd,id);
	}
@DeleteMapping("delets/{del}")
public String method4(@PathVariable(value="del")int id) {
	return sc.methodservice5(id);
}
}
