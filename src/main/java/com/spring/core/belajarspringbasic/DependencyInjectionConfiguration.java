package com.spring.core.belajarspringbasic;

import com.spring.core.belajarspringbasic.data.Bar;
import com.spring.core.belajarspringbasic.data.Foo;
import com.spring.core.belajarspringbasic.data.FooBar;
import lombok.Data;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Novin on 21/02/2023
 * @project Belajar-Spring-Basic
 */
@Configuration
public class DependencyInjectionConfiguration {

    @Bean
    public Foo foo() {
        return new Foo();
    }

    @Bean
    public Bar bar() {
        return new Bar();
    }

    @Bean
    public FooBar fooBar(Foo foo, Bar bar) {
        return new FooBar(foo, bar);
    }
}
