package example;




import example.ProducesWithChildNoError.TestMethods;
import example.ProducesWithChildNoError.TestMethods1;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Olga Pavlova on 22/09/2015.
 */
@ApplicationPath("")
public class ConfigRest extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        HashSet h = new HashSet<Class<?>>();

        h.add(TestMethods.class);
        h.add(TestMethods1.class);

        h.add(example.ProducesSubResourceNoError.MyRes.class);
        h.add(example.ProducesSubResourceNoError.ProduceTest.class);



        h.add(example.ConsumesSubResourceNoError.MyRes.class);
        h.add(example.ConsumesSubResourceNoError.ProduceTest.class);

        h.add(SomeDiffConsumes.class);
        h.add(SomeDiffProduces.class);
        //h.add(SomeEqualConsumes.class);
        //h.add(SomeEqualProduces.class);


        return h;

    }

}
