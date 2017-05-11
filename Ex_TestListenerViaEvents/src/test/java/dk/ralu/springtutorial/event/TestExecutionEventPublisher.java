package dk.ralu.springtutorial.event;

import org.springframework.test.context.TestContext;
import org.springframework.test.context.support.AbstractTestExecutionListener;

// Registered with Spring in /src/test/resources/META-INF/spring.factories
public class TestExecutionEventPublisher extends AbstractTestExecutionListener {

    @Override
    public void beforeTestMethod(TestContext testContext) throws Exception {
        testContext.getApplicationContext().publishEvent(new BeforeTestMethodEvent(testContext.getTestInstance(), testContext));
    }

    @Override
    public void afterTestMethod(TestContext testContext) throws Exception {
        testContext.getApplicationContext().publishEvent(new AfterTestMethodEvent(testContext.getTestInstance(), testContext));
    }
}
