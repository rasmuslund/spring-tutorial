package dk.ralu.springtutorial.event;

import org.springframework.context.ApplicationEvent;
import org.springframework.test.context.TestContext;

public abstract class TestExecutionEvent extends ApplicationEvent{

    private final TestContext testContext;

    /**
     * Create a new TestExecutionEvent.
     *
     * @param source the object on which the event initially occurred (never {@code null})
     */
    public TestExecutionEvent(Object source, TestContext testContext) {
        super(source);
        this.testContext = testContext;
    }

    public TestContext getTestContext() {
        return testContext;
    }

}