package service;

import org.junit.jupiter.api.Test;

import services.YourServiceImpl;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class YourServiceImplTest {

    @Test
    public void testGetGreeting() {
        YourServiceImpl yourService = new YourServiceImpl();
        String result = yourService.getGreeting();
        assertEquals("Hello, World from Service!", result);
    }
}
