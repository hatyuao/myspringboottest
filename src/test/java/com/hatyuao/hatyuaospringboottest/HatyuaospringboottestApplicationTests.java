package com.hatyuao.hatyuaospringboottest;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
class HatyuaospringboottestApplicationTests {

    @Test
    @Transactional()
    void contextLoads() {
    }

}
