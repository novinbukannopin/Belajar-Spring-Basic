package com.spring.core.belajarspringbasic;

import com.spring.core.belajarspringbasic.data.Foo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Novin on 21/02/2023
 * @project Belajar-Spring-Basic
 */
@Slf4j
@Configuration
public class BeanConfiguration {

    @Bean
    public Foo foo() {
        Foo foo = new Foo();
        log.info("create new foo");
        return foo;
    }
}
