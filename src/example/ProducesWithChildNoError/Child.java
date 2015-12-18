package example.ProducesWithChildNoError;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("TestMethods")
public class Child extends TestMethods{
    @GET
    @Produces(MediaType.TEXT_XML)
    //@Path("d")
    public String foo5() {    return "<gg>bla5</gg>"; }

    /*@GET
    @Produces(MediaType.TEXT_XML)
    @Path("d")
    public String foo3() {    return "bla5"; }*/
}
