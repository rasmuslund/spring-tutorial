package dk.ralu.springtutorial.profile;

import java.time.Instant;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TimeProviderThirdTest {

    @MockBean
    private TimeProvider timeProvider; // Creates or replaces bean of same type (results in new application context)

    @Autowired
    private TimeProviderUser timeProviderUser;

    private Instant instant = Instant.parse("2007-12-03T10:15:30.00Z");

    @Before
    public void before() {
        Mockito.when(timeProvider.now()).thenReturn(instant);
    }

    @Test
    public void testProdVersionOfTimeProvider() {
        Assert.assertEquals("2007-12-03T10:15:30Z", timeProviderUser.nowAsString());
    }
}
