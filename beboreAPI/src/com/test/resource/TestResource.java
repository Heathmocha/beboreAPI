package com.test.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("beer")
public class TestResource {
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String getBeer()
	{
		System.out.println("HM - this is a print to see if i get here!");
		
		
		return null;
	}
}
