package com.example.sqLite_demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.sqLite_demo.dao.CubesDao;
import com.example.sqLite_demo.model.Cubes;

@Service
public class CubesService {
	
	@Autowired
	private CubesDao cubesDao;

	public Cubes addCubes(Cubes cubes){return cubesDao.save(cubes); }
	
	public List<Cubes> findAllCubes() {
		return (List<Cubes>) cubesDao.findAll(); 
	}

}
