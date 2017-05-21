package com.demo.resorces;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.demo.model.Student;

@Path("/student")
public class StudentResource {
	
	
	@GET
	@Path("/xmlget")
	@Produces("application/xml")
	public Student getstudent(){
		
		Student student=new Student();
		
		student.setAddress("bangalore");
		student.setName("svr");
		student.setId(32);
		
		return student;
	}
	@POST
	@Path("/xmlpost")
	@Produces("application/xml")
	public Response poststudent(Student student){
		
	
		String result="saved student"+student;
		
		return Response.status(200).entity(result).build();
	}
	@GET
	@Path("/jsonget")
	@Produces("application/json")
	public Student getjsonstudent(){
		
		Student student=new Student();
		
		student.setAddress("bangalore");
		student.setName("svr");
		student.setId(32);
		
		return student;
	}
	@POST
	@Path("/jsonpost")
	@Produces("application/json")
	public Response postjsonstudent(Student student){
		
	
		String result="saved student"+student;
		
		return Response.status(200).entity(result).build();
	}
}
