package org.jugpy.web.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import javax.inject.Inject;

import org.jugpy.services.JugPyService;

@Path("jugpy")
public class JugPyResource {
	
	@Inject 
	private JugPyService jugPyService;
	
	@Path("info.html")
	@GET
	@Produces("text/html")
	public Response getInfo() {
		return Response
			.ok(jugPyService.getBasicInformation())
			.build();
	}
	
}
