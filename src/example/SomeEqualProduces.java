package example;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 * Created by Olga Pavlova on 12/18/2015.
 */
@Path("SomeEqualProduces")
public class SomeEqualProduces {

    @GET
    @Produces("text/plain")
    public String foo() {    return "bla"; }

    @GET
    @Produces("text/plain")
    public String foo1() {    return "bla"; }
}
