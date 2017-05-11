package dk.ralu.springtutorial.event;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import org.springframework.test.context.TestContext;
import org.springframework.test.context.support.AbstractTestExecutionListener;

// Registered with Spring in /src/test/resources/META-INF/spring.factories
public class ActivateCleanupBeansTestExecutionListener extends AbstractTestExecutionListener {

    @Override
    public void beforeTestMethod(TestContext testContext) throws Exception {
        getActivatedCleanupBeans(testContext).forEach(cleanupBeanType -> {
            TestCleanupBean cleanupBean = testContext.getApplicationContext().getBean(cleanupBeanType);
            try {
                cleanupBean.beforeTestMethod(testContext);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        });
    }

    @Override
    public void afterTestMethod(TestContext testContext) throws Exception {
        getActivatedCleanupBeans(testContext).forEach(cleanupBeanType -> {
            TestCleanupBean cleanupBean = testContext.getApplicationContext().getBean(cleanupBeanType);
            try {
                cleanupBean.afterTestMethod(testContext);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        });
    }

    private Set<Class<? extends TestCleanupBean>> getActivatedCleanupBeans(TestContext testContext) {
        Set<Class<? extends TestCleanupBean>> cleanupBeanTypes = Collections.emptySet();
        TestCleanupBeans classAnnotation = testContext.getTestClass().getAnnotation(TestCleanupBeans.class);
        if (classAnnotation != null) {
            cleanupBeanTypes = new HashSet<>(Arrays.asList(classAnnotation.value()));
        }
        TestCleanupBeans methodAnnotation = testContext.getTestMethod().getAnnotation(TestCleanupBeans.class);
        if (methodAnnotation != null) {
            // If annotation is used on both class and method, then method annotation is used
            cleanupBeanTypes = new HashSet<>(Arrays.asList(methodAnnotation.value()));
        }
        return cleanupBeanTypes;
    }
}
