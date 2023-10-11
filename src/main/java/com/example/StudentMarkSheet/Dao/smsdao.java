package com.example.StudentMarkSheet.Dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.StudentMarkSheet.Entity.smsenti;
import com.example.StudentMarkSheet.Repository.smsRepo;

@Repository
public class smsdao {
	
	@Autowired
	smsRepo smRpo;
	

	public smsenti insertStudent(smsenti e) {
		
		return smRpo.save(e);
	}

}
