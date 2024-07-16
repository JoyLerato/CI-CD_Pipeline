package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import services.YourService;

@RestController
@RequestMapping("/api")
public class YourController {

    private final YourService yourService;

    public YourController(YourService yourService) {
        this.yourService = yourService;
    }

    @GetMapping("/hello")
    public String sayHello() {
        return yourService.getGreeting();
    }
}
