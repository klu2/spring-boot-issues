package net.klu2.springboot.autoconfigure;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.MessageSourceAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

/**
 * @author Klaus Lehner, Catalysts GmbH
 */
@Configuration
@EnableAutoConfiguration
@PropertySource(value = "classpath:test.properties")
public class TestConfiguration {
}
