package net.klu2.springboot.autoconfigure;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ActiveProfiles;

/**
 * @author Klaus Lehner, Catalysts GmbH
 */
@Configuration
@EnableAutoConfiguration
@ActiveProfiles("test")
public class TestConfiguration {
}
