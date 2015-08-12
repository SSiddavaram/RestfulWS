package com.ws.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.ws.vo.Person;

@Path("json/person")
public class PersonService {
	
	@GET
	@Path("/get")
	@Produces(MediaType.APPLICATION_JSON)
	public Person getPersonJson(){
		Person person = new Person();
		person.setFirstName("Soujanya");
		person.setLastName("Siddavaram");
		person.setAge(25);
		return person;
	}
	
	@POST
	@Path("/post")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response createTrackInJSON(Person person) {

		String result = "Person saved : " + person;
		return Response.status(201).entity(result).build();
		
	}
}
