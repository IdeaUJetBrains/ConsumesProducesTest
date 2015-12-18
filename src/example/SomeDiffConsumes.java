package example;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;


/**
 * Created by Olga Pavlova on 12/18/2015.
 */
@Path("SomeDiffConsumes")
public class SomeDiffConsumes {
    @GET
    @Consumes("text/plain")
    public String foo() {    return "bla"; }

    @GET
    @Consumes("text/html")
    public String foo1() {    return "bla"; }
}
