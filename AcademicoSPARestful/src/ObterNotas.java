import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.json.JSONObject;


@Path("/obternotas")
public class ObterNotas {
	
	@GET
	@Produces("application/json")
	public Response obterNotas(){
		JSONObject objetoJson = new JSONObject();
		
		objetoJson.put("Matricula", "9999999");
		objetoJson.put("Nome", "Pedro");
		objetoJson.put("Nota", "100");
		
		return Response.status(200).entity(objetoJson.toString()).build();
		
		
	}
}
