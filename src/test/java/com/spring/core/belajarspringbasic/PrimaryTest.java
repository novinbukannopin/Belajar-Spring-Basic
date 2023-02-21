package com.spring.core.belajarspringbasic;

import com.spring.core.belajarspringbasic.data.Foo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Novin on 21/02/2023
 * @project Belajar-Spring-Basic
 */
public class PrimaryTest {
    static ApplicationContext context;

    @BeforeEach
    void setUp() {
        context = new AnnotationConfigApplicationContext(PrimaryConfiguration.class);
    }

    @Test
    void testGetPrimary() {
        Foo bean = context.getBean(Foo.class);
        Foo foo1 = context.getBean("foo1", Foo.class);
        Foo foo2 = context.getBean("foo2", Foo.class);

        Assertions.assertSame(bean, foo1);
        Assertions.assertNotSame(bean, foo2);
        Assertions.assertNotSame(foo1, foo2);
    }
}
