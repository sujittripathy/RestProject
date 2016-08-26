package org.git.jersey;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/calculator")
public class RestResource {

		@GET
		public String getCalc(){
			return "Test String";
		}
}
