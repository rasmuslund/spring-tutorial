package dk.ralu.springtutorial.event;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.TestExecutionListeners.MergeMode;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
// Note that TestExecutionListeners is a meta annotation
@TestExecutionListeners(listeners = {CassandraTestCleanupExecutionListener.class}, mergeMode = MergeMode.MERGE_WITH_DEFAULTS)
public @interface CassandraTestCleanup {

}
