package example.ConsumesSubResourceNoError;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by Olga Pavlova on 12/18/2015.
 */
@Path("/resClass1/resMethod1/subresMethod")
public class ProduceTest {

    @GET
    @Consumes(MediaType.TEXT_XML)
    public String fooSub() {
        return  "<d>test</d>";
    }
}
