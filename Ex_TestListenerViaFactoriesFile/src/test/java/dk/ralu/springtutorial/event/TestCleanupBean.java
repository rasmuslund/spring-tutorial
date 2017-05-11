package dk.ralu.springtutorial.event;

import org.springframework.test.context.TestContext;

public interface TestCleanupBean {
    void beforeTestMethod(TestContext testContext) throws Exception;
    void afterTestMethod(TestContext testContext) throws Exception;
}
