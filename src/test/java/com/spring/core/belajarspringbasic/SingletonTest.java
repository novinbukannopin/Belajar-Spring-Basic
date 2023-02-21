package com.spring.core.belajarspringbasic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Novin on 21/02/2023
 * @project Belajar-Spring-Basic
 */
public class SingletonTest {
    @Test
    void testSingleton() {
        var database1 = Database.getInstance();
        var database2 = Database.getInstance();

        Assertions.assertSame(database1, database2);
    }
}
