package org.git.jersey.resource;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.git.jersey.model.Policy;

@Path("/calculator")
public class RestResource {

		@GET
		public String getCalc(){
			return "Test String";
		}
		
		@POST
		@Path("/add")
		@Produces(MediaType.APPLICATION_JSON)
		@Consumes(MediaType.APPLICATION_JSON)
		public Policy createPolicy(Policy policy){
			System.out.println(policy.getPolicyNumber()+","+policy.getState());
			policy.setInsuredLName("new Name");
			return policy;
		}
}
