package net.klu2.springboot.autoconfigure;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Locale;

import static org.junit.Assert.assertEquals;

/**
 * @author Klaus Lehner, Catalysts GmbH
 */
@ContextConfiguration(classes = {TestConfiguration.class})
@RunWith(SpringJUnit4ClassRunner.class)
public class MessageSourceAutoConfigurationTest {

    @Autowired
    MessageSource messageSource;

    /**
     * This test fails with Spring Boot 1.1.0, as the messages are not loaded, but it works with Spring Boot 1.0.2
     */
    @Test
    public void checkMessage() {
        assertEquals("Please enter a value.", messageSource.getMessage("NotNull", new Object[0], Locale.ENGLISH));
    }

}
