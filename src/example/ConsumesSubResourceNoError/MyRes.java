package example.ConsumesSubResourceNoError;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Deployed to http://localhost:8080/.../resClass/resMethod1/subresMethod
 */

@Path("/resClass1")
public class MyRes {

    @Path("/resMethod1")
    @Consumes(MediaType.TEXT_XML)
    public SubRes foo() {
        return new SubRes();
    }


    public static class SubRes {
        @GET
        @Path("/subresMethod")
        @Consumes(MediaType.TEXT_XML)
        public String fooSub() {
            return  "<d>subres</d>";
        }
    }
}
