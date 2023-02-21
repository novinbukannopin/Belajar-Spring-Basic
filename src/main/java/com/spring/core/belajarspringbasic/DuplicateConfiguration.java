package com.spring.core.belajarspringbasic;

import com.spring.core.belajarspringbasic.data.Foo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Novin on 21/02/2023
 * @project Belajar-Spring-Basic
 */
@Configuration
public class DuplicateConfiguration {

    @Bean
    public Foo foo1() {
        return new Foo();
    }

    @Bean
    public Foo foo2() {
        return new Foo();
    }
}
