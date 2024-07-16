package controller;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import services.YourService;

@WebMvcTest(YourController.class)
public class YourControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private YourService yourService;

    @Test
    public void testSayHello() throws Exception {
        when(yourService.getGreeting()).thenReturn("Hello, World from Service!");

        mockMvc.perform(get("/api/hello"))
                .andExpect(status().isOk())
                .andExpect(content().string("Hello, World from Service!"));
    }
}
