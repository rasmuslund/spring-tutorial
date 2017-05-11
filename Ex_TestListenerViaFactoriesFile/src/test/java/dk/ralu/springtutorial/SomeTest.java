package dk.ralu.springtutorial;

import dk.ralu.springtutorial.bean.CassandraTestCleanupBean;
import dk.ralu.springtutorial.bean.ElasticsearchTestCleanupBean;
import dk.ralu.springtutorial.listener.TestCleanupBeans;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = SpringConfiguration.class)
@TestCleanupBeans({CassandraTestCleanupBean.class, ElasticsearchTestCleanupBean.class})
public class SomeTest {

    @Test
    public void test1() {
        System.out.println(getClass().getSimpleName() + ".test1()");
    }

    @Test
    @TestCleanupBeans(CassandraTestCleanupBean.class)
    public void test2() {
        System.out.println(getClass().getSimpleName() + ".test2()");
    }
}
