package com.yyk.hellper;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.*;

@ActiveProfiles("local")
@SpringBootTest
class HellperApplicationTests {

    @DisplayName("왼쪽 사이드바 디스플레이 이름")
    @Test
    void firstTest() {
        String str = "a";
        assertNotNull(str);
    }

}
