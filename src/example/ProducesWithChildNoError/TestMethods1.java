package example.ProducesWithChildNoError;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("TestMethods")
@Produces(MediaType.TEXT_XML)
public class TestMethods1 {

    @GET
    @Produces(MediaType.TEXT_XML)
    public String foo1() {    return "<bla1>sss</bla>"; }

}
