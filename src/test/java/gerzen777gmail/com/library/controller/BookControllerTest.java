package gerzen777gmail.com.library.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
@Transactional
@AutoConfigureMockMvc
public class BookControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Test
    public void bookControllerTest() throws Exception {
        ObjectMapper objectMapper = new ObjectMapper();
        LibraryRequest libraryRequest = new LibraryRequest(1, "2");

        ResultActions resultActions = mockMvc.perform(MockMvcRequestBuilders
                .post("/library")
                .content(objectMapper.writerFor(LibraryRequest.class).writeValueAsString(libraryRequest))
                .contentType("application/json"))
                .andExpect(MockMvcResultMatchers.status().isOk());

        String contentAsString = resultActions
                .andReturn()
                .getResponse()
                .getContentAsString();

        System.out.println(contentAsString);
    }
}