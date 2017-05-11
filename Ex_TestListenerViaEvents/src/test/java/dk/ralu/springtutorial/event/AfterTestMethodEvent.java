package dk.ralu.springtutorial.event;

import org.springframework.test.context.TestContext;

public class AfterTestMethodEvent extends TestExecutionEvent {
    public AfterTestMethodEvent(Object source, TestContext testContext) {
        super(source, testContext);
    }
}
