package services;

import org.springframework.stereotype.Service;

@Service
public class YourServiceImpl implements YourService {

    @Override
    public String getGreeting() {
        return "Hello, World from Service!";
    }
}
