package blog.codingideas.elasticstack2019;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            if (i % 3 == 0) {
                logger.info("{} is dividable by 3. ", i);
            }
            else if (i % 2 == 0) {
                logger.warn("{} is dividable by 2. ", i);
            } else {
                try {
                    throw new IllegalArgumentException("Some strange number!");
                } catch (IllegalArgumentException e) {
                    logger.error("Something bad happened", e);
                }
            }
        }
    }

}
