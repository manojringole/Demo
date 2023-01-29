package com.Manoj.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.Manoj.service.Welcomeservice;

@WebMvcTest(value =  WelcomeControler.class)
public class WelcomeControlerTest {

	@MockBean
	private Welcomeservice welcomeservice;
	@Autowired
	private MockMvc mockMvc;
	
	@Test
	public void wecomeTest() throws Exception {
		
		when(welcomeservice.welcome()).thenReturn("aaa");
		
		MockHttpServletRequestBuilder res = MockMvcRequestBuilders.get("/wel");
		
		ResultActions perform = mockMvc.perform(res);
		
		MvcResult result = perform.andReturn();
		
		MockHttpServletResponse response = result.getResponse();
		
		int status = response.getStatus();
		
		assertEquals(200, status);
		
	}
	
	}
	
	
