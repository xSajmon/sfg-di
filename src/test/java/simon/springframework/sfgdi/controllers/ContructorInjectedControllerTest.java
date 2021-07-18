package simon.springframework.sfgdi.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import simon.springframework.sfgdi.services.ConstructorGreetingService;

class ContructorInjectedControllerTest {

    ConstructorInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new ConstructorInjectedController(new ConstructorGreetingService());

    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}