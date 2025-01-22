package ru.job4j.devops;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class CalcApplicationTests {

    @Disabled
    @Test
    void contextLoads() {
        /*
        This test ensures that the Spring application context loads successfully
         */
    }

    @Disabled
    @Test
    void mainMethodTest() {
        CalcApplication.main(new String[]{});
    }
}