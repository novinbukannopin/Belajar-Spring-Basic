package com.spring.core.belajarspringbasic;

import com.spring.core.belajarspringbasic.data.Bar;
import com.spring.core.belajarspringbasic.data.Foo;
import com.spring.core.belajarspringbasic.data.FooBar;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Novin on 21/02/2023
 * @project Belajar-Spring-Basic
 */
public class DependencyInjectionTest {

    @Test
    void testNoDI() {
        var foo = new Foo();
        var bar = new Bar();
        var fooBar = new FooBar(foo, bar);

        Assertions.assertSame(foo, fooBar.getFoo());
        Assertions.assertSame(bar, fooBar.getBar());
    }

    @Test
    void testDI() {
        ApplicationContext context = new AnnotationConfigApplicationContext(DependencyInjectionConfiguration.class);
        var foo = context.getBean(Foo.class);
        var bar = context.getBean(Bar.class);
        var fooBar = context.getBean(FooBar.class);

        Assertions.assertSame(foo, fooBar.getFoo());
        Assertions.assertSame(bar, fooBar.getBar());

    }
}
