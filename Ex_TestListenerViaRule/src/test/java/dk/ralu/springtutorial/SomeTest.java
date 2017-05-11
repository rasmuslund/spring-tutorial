package dk.ralu.springtutorial;

import dk.ralu.springtutorial.event.CassandraTestCleanupRule;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = SpringConfiguration.class)
public class SomeTest {

    @Rule
    @Autowired
    public CassandraTestCleanupRule cassandraTestCleanupRule;

    @Test
    public void test1() {
        System.out.println(getClass().getSimpleName() + ".test1()");
    }

    @Test
    public void test2() {
        System.out.println(getClass().getSimpleName() + ".test2()");
    }
}
