package example.ProducesWithChildNoError;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("TestMethods")
@Produces(MediaType.APPLICATION_JSON)
public class TestMethods {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String foo() {    return "bla"; }

}
