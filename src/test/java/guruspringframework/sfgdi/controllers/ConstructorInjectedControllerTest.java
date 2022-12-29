package guruspringframework.sfgdi.controllers;

import guruspringframework.sfgdi.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConstructorInjectedControllerTest { // njabardziej preferowany sposob wstrzykiwania ależności
    ConstructorInjectedController controller;
    @BeforeEach
    void setUp(){
        controller = new ConstructorInjectedController(new GreetingServiceImpl());
    }
@Test
    void getGreeting(){
    System.out.println(controller.getGreeting());
}
}