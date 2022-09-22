package io.github.dutchmahoney.terselogbackcensorsexample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(final String[] args) {
        final var ssn = "000-11-2222";

        logger.info("hunter2");
        logger.info(ssn);
        logger.info(new SocialSecurityNumber(ssn).toString());
    }

}

record SocialSecurityNumber(String socialSecurityNumber) {}
