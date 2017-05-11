package dk.ralu.springtutorial;

import dk.ralu.springtutorial.listener.CassandraTestCleanup;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = SpringConfiguration.class)
@CassandraTestCleanup // Only works on class
public class SomeTest {

    @Test
    public void test1() {
        System.out.println(getClass().getSimpleName() + ".test1()");
    }

    @Test
    public void test2() {
        System.out.println(getClass().getSimpleName() + ".test2()");
    }
}
