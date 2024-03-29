package com.stepasha.artportfolio.controllers;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.context.WebApplicationContext;

import java.util.ArrayList;

import static io.restassured.module.mockmvc.RestAssuredMockMvc.given;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.number.OrderingComparison.lessThan;

//todo 1 ICT set up integration test on restaurant controller
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ArtControllerIntegrationTest {

    //todo 2 ICT bring in own application context
    @Autowired
    private WebApplicationContext webApplicationContext;
    //todo 3 ICT set up MockMVC (setup complete )
    @Before
    public void initialiseRestAssuredMockMvcWebApplicationContext()
    {
        RestAssuredMockMvc.webAppContextSetup(webApplicationContext);
    }
   @Test
   public void whenMeasuredReponseTime() throws Exception
   {
       given().when().get("/art/arts").then().time(lessThan(10000L));
   }


}
