package dk.ralu.springtutorial.bean;

import dk.ralu.springtutorial.event.AfterTestMethodEvent;
import dk.ralu.springtutorial.event.BeforeTestMethodEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

@Service
public class CassandraTestCleanupBean {

    @EventListener
    public void beforeTestMethod(BeforeTestMethodEvent event) throws Exception {
        System.out.println(getClass().getSimpleName() + ".beforeTestMethod(" + event.getTestContext().getTestMethod().getName() + ")");
    }

    @EventListener
    public void afterTestMethod(AfterTestMethodEvent event) throws Exception {
        System.out.println(getClass().getSimpleName() + ".afterTestMethod(" + event.getTestContext().getTestMethod().getName() + ")");
    }
}
