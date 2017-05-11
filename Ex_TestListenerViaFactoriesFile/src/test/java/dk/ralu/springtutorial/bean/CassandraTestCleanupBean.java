package dk.ralu.springtutorial.bean;

import dk.ralu.springtutorial.listener.TestCleanupBean;
import org.springframework.stereotype.Service;
import org.springframework.test.context.TestContext;

@Service
public class CassandraTestCleanupBean implements TestCleanupBean {

    @Override
    public void beforeTestMethod(TestContext testContext) throws Exception {
        System.out.println(getClass().getSimpleName() + ".beforeTestMethod(" + testContext.getTestMethod().getName() + ")");
    }

    @Override
    public void afterTestMethod(TestContext testContext) throws Exception {
        System.out.println(getClass().getSimpleName() + ".afterTestMethod(" + testContext.getTestMethod().getName() + ")");
    }
}
