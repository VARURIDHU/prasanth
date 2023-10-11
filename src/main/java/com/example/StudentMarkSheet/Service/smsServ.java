package com.example.StudentMarkSheet.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.StudentMarkSheet.Dao.smsdao;
import com.example.StudentMarkSheet.Entity.smsenti;


@Service

public class smsServ {
	@Autowired
	smsdao smdo;
	
	public smsenti insertStudent(smsenti e) {
		int sem1Total=e.getSem1Theory()+e.getSem1Practicals();
		int sem2Total=e.getSem2Theory()+e.getSem2Practicals();
		e.setSem1Total(sem1Total);
		e.setSem2Total(sem2Total);
		return smdo.insertStudent(e);
	}

}
