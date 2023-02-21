package com.spring.core.belajarspringbasic;

import com.spring.core.belajarspringbasic.data.Foo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 * @author Novin on 21/02/2023
 * @project Belajar-Spring-Basic
 */
@Configuration
public class BeanNameConfiguration {

    @Primary
    @Bean(name = "fooFirst")
    public Foo foo1() {
        return new Foo();
    }

    @Bean(name = "fooSecond")
    public Foo foo2() {
        return new Foo();
    }
}
