package com.example.StudentMarkSheet.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.StudentMarkSheet.Entity.smsenti;
import com.example.StudentMarkSheet.Service.smsServ;

@RestController
@RequestMapping(value="/mark")
public class smscont {
	@Autowired
	smsServ stumark;
	
	@PostMapping(value="/add")
	public smsenti insertStudent(@RequestBody smsenti e) {
		return stumark.insertStudent(e);
	}

}
