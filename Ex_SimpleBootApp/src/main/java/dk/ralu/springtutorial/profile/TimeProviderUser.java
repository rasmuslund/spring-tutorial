package dk.ralu.springtutorial.profile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TimeProviderUser {

    @Autowired
    private TimeProvider timeProvider;

    public String nowAsString() {
        return timeProvider.now().toString();
    }
}
