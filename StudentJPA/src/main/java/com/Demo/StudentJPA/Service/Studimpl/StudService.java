package com.Demo.StudentJPA.Service.Studimpl;

import org.springframework.stereotype.Service;

import com.Demo.StudentJPA.DTO.StudDto;
import com.Demo.StudentJPA.Model.Student;
import com.Demo.StudentJPA.Repository.StudRepo;
import com.Demo.StudentJPA.Service.StudentService;

@Service
public class StudService implements StudentService{
	
	StudRepo ref;

	public StudService(StudRepo ref) {
		super();
		this.ref = ref;
	}

	@Override
	public StudDto inserRec(StudDto sdto) {
		// TODO Auto-generated method stub
		Student obj=new Student();
		obj.setRno(sdto.getRno());
		obj.setName(sdto.getName());
		obj.setPer(sdto.getPer());
		
		Student newobj=ref.save(obj);
		
		StudDto studres = new StudDto();
		studres.setRno(newobj.getRno());
		studres.setName(newobj.getName());
		studres.setPer(newobj.getPer());
		
		
		return studres;
	}
	

}
