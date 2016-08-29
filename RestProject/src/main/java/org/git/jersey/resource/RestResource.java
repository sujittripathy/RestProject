package org.git.jersey.resource;

import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;

import org.git.jersey.model.Policy;

@Path("calculator")
public class RestResource {

		@GET
		public String getCalc(){
			return "Test String";
		}
		
		@GET
		@Path("{name}")
		@Produces({MediaType.APPLICATION_JSON})
		public String testPost(@PathParam("name") String val){
			return "hello" + val;
		}
		
		@POST
		@Path("add")
		//@Produces(MediaType.APPLICATION_JSON)
		public String createPolicy(MultivaluedMap<String,String> formData,
				@HeaderParam("user-agent") String ua){
			System.out.println("Data >>"+formData+", ua value:"+ua);
			return "Added";
		}
		
		@GET
		@Path("/getPolicies")
		@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
		public Policy[] getPolicies(){
			Policy[] policyArr = new Policy[2];
			policyArr[0]=new Policy("AZAP00001","AZ","Hello F","Hello L");
			policyArr[1]=new Policy("NVAP00001","NV","Hello F1","Hello L2");
			return policyArr;
		}
}
