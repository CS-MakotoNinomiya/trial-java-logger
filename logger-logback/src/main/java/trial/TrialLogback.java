package trial;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TrialLogback {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    public static void main(String[] args) {
        (new TrialLogback()).execute(args);
    }

    public void execute(String[] args) {
        logger.trace("trace log.");
        logger.trace("trace log {}.", 1);

        logger.debug("debug log.");
        logger.debug("debug log {}.", 1);

        logger.info("info log.");
        logger.info("info log {}.", 1);

        logger.warn("warning log.");
        logger.warn("warning log {}.", 1);

        logger.error("error log.");
        logger.error("error log {}.", 1);
        logger.error("error", new RuntimeException("trial exception."));
    }
}
