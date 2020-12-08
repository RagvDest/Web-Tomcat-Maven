package com.clearminds.servicios;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/personas")
public class ServicioPersona {
	
	
	@Path("/busqueda")
	@GET
	public String consultar(){
		return "Buenas tardes chicos";
	}
}
