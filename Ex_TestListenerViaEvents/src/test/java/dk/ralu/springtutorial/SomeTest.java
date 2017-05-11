package dk.ralu.springtutorial;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = SpringConfiguration.class)
// You can't see on this test, which cleanup beans are going to run between your tests.
// On the other hand, cleanup just works on all tests, without having to remember to activate them.
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
