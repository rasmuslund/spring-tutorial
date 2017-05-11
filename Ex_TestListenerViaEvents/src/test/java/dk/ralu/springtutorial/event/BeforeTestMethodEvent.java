package dk.ralu.springtutorial.event;

import org.springframework.test.context.TestContext;

public class BeforeTestMethodEvent extends TestExecutionEvent {
    public BeforeTestMethodEvent(Object source, TestContext testContext) {
        super(source, testContext);
    }
}
