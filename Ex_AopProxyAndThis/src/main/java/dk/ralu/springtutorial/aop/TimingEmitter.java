package dk.ralu.springtutorial.aop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
class TimingEmitter {

    private static final Logger LOGGER = LoggerFactory.getLogger(TimingEmitter.class);

    void emitTiming(Timing timing) {
        LOGGER.info(timing.toString());
    }
}
