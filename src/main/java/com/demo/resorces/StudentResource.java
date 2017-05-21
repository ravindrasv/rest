package com.demo.resorces;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.demo.model.Student;

@Path("/student")
public class StudentResource {
	
	
	@GET
	@Path("/get")
	@Produces("application/xml")
	public Student getstudent(){
		
		Student student=new Student();
		
		student.setAddress("bangalore");
		student.setName("svr0");
		student.setId(32);
		
		return student;
	}
	@POST
	@Path("/post")
	@Produces("application/xml")
	public Student poststudent(){
		
		Student student=new Student();
		
		
		return student;
	}
	

}
