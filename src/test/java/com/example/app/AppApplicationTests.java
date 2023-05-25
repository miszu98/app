package com.example.app;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
class AppApplicationTests {

    @Test
    void exampleTest() {
        assertEquals(2, 1 + 1);
    }

    @Test
    void exampleTest2() {
        assertEquals(3, 1 + 2);
    }
}
