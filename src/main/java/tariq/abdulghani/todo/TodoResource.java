package tariq.abdulghani.todo;

import javax.ws.rs.GET;
import javax.ws.rs.OPTIONS;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/todo")
public class TodoResource {

    @GET
    @Path("/")
    public  Response getAll(){
        return Response.ok("hello JAX_RS API").build();
    }

}
