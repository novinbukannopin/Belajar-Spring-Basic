package com.spring.core.belajarspringbasic;

import com.spring.core.belajarspringbasic.data.Foo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Novin on 21/02/2023
 * @project Belajar-Spring-Basic
 */
public class BeanNameTest {

    static ApplicationContext context;

    @Test
    void testBeanName() {
        context = new AnnotationConfigApplicationContext(BeanNameConfiguration.class);

        var bean = context.getBean(Foo.class);
        var fooFirst = context.getBean("fooFirst", Foo.class);
        var fooSecond = context.getBean("fooSecond", Foo.class);

        Assertions.assertSame(bean, fooFirst);
        Assertions.assertNotSame(bean, fooSecond);
        Assertions.assertNotSame(fooFirst, fooSecond);
    }
}
