package com.spring.core.belajarspringbasic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Novin on 21/02/2023
 * @project Belajar-Spring-Basic
 */
public class ApplicationContextTest {
    @Test
    void testApplicationContext() {
        ApplicationContext context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
        Assertions.assertNotNull(context);
    }
}
