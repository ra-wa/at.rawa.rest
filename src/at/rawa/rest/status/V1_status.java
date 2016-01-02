package at.rawa.rest.status;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/v1/status")
public class V1_status {
	
		private static final String api_version = "00.01.00";

		@GET
		@Produces(MediaType.TEXT_HTML)
		public String returnTitle() {
			
			return "<p>Java Web Service</p>";
		}
		
		@GET
		@Path("/version")
		@Produces(MediaType.TEXT_HTML)
		public String returnVersion() {
			
			return "<p>Version: " + api_version + "</p>";
		}
}
