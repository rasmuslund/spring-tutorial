package dk.ralu.springtutorial.listener;

import org.springframework.test.context.TestContext;
import org.springframework.test.context.support.AbstractTestExecutionListener;

public class CassandraTestCleanupExecutionListener extends AbstractTestExecutionListener {

    @Override
    public void beforeTestMethod(TestContext testContext) throws Exception {
        CassandraTestCleanup annotation = testContext.getTestClass().getAnnotation(CassandraTestCleanup.class);
        if (annotation != null) {
            // Could get Cassandra session like this:
            // testContext.getApplicationContext().getBean(Session.class);
            System.out.println(getClass().getSimpleName() + ".beforeTestMethod(..)");
        }
    }

    @Override
    public void afterTestMethod(TestContext testContext) throws Exception {
        CassandraTestCleanup annotation = testContext.getTestClass().getAnnotation(CassandraTestCleanup.class);
        if (annotation != null) {
            System.out.println(getClass().getSimpleName() + ".afterTestMethod(..)");
        }
    }
}
