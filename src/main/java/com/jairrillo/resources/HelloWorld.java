package com.jairrillo.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/hello")
public class HelloWorld {
	
	@GET
	public String getMessage() {
		return "Hello Java Docker World";
	}

}
