package com.marko.learning.github.actions;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class HelloControllerTest {


    @Test
    void shouldReturnHello() {
        HelloController helloController = new HelloController();

        String hello = helloController.hello();

        assertThat(hello).isEqualTo("hello");
    }

}