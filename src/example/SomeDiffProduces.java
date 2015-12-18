package example;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 * Created by Olga Pavlova on 12/18/2015.
 */
@Path("SomeDiffProduces")
public class SomeDiffProduces {

    @GET
    @Produces("text/plain")
    public String foo() {    return "bla"; }

    @GET
    @Produces("text/html")
    public String foo1() {    return "bla"; }
}
