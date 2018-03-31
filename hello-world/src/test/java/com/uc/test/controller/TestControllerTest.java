package com.uc.test.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

/**
 * User: uc
 * Date: 2018-03-31
 * Time: 11:47
 * Desc:
 */
@RunWith(SpringRunner.class)
@WebMvcTest(TestController.class)
public class TestControllerTest {

    @Autowired
    private MockMvc mvc;

    @Test
    public void testEcho() throws Exception {
        this.mvc.perform(get("/test/echo?msg={value}", "uc1")
                .accept(MediaType.APPLICATION_JSON_UTF8)
        ).andExpect(MockMvcResultMatchers.status().isOk()).andExpect(content().string("uc1"));
    }
}
