package dk.ralu.springtutorial.event;

import org.junit.rules.TestRule;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;
import org.springframework.stereotype.Service;

@Service
public class CassandraTestCleanupRule implements TestRule {

    @Override
    public Statement apply(Statement base, Description description) {
        return new Statement() {
            @Override
            public void evaluate() throws Throwable {
                System.out.println(CassandraTestCleanupRule.class.getSimpleName() + ".beforeTest(" + description.getMethodName() + ")");
                base.evaluate();
                System.out.println(CassandraTestCleanupRule.class.getSimpleName() + ".afterTest(" + description.getMethodName() + ")");
            }
        };
    }
}
