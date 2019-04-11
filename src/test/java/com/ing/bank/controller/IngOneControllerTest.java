package com.ing.bank.controller;

import static org.junit.Assert.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.ing.bank.service.IngGroupService;

public class IngOneControllerTest {

	@InjectMocks
	private IngProductController ingController;

	@Mock
	private IngGroupService ingService;

	private MockMvc mockMvc;

	@Autowired
	private WebApplicationContext webApplicationContext;

	@Before
	public void init() {
		MockitoAnnotations.initMocks(this);
		this.mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
		// this.mockMvc = MockMvcBuilders.standaloneSetup(ingController).build();
	}

	@Test
	public void testGetVerision() throws Exception {
		/*
		 * User u = new User(); u.setId(1l);
		 * when(userRepository.findOne(1l)).thenReturn(u);
		 * 
		 * User user = userController.get(1L);
		 * 
		 * verify(userRepository).findOne(1l);
		 * 
		 * List<User> users = userRepository.findAll(); assertThat(users.size(),
		 * is(greaterThanOrEqualTo(0)));
		 */
		assertEquals("10.10.10.01", ingController.version());

		this.mockMvc.perform(get("/verison")).andExpect(status().isOk())
				.andExpect(content().contentType("application/json;charset=UTF-8"))
				.andExpect(jsonPath("$.verison").value("1"));

	}
	
//	 @Test
//	    public void testFindAll() {
//	        List<User> users = userRepository.findAll();
//	        assertThat(users.size(), is(greaterThanOrEqualTo(0)));
//	    }
/*	
	 @Test
	    public void testListAll() throws IOException {
	        RestTemplate restTemplate = new TestRestTemplate();
	        ResponseEntity<String> response = restTemplate.getForEntity("http://localhost:8080/api/v1/users", String.class);

	        assertThat(response.getStatusCode(), equalTo(HttpStatus.OK));

	        ObjectMapper objectMapper = new ObjectMapper();
	        JsonNode responseJson = objectMapper.readTree(response.getBody());

	        assertThat(responseJson.isMissingNode(), is(false));
	        assertThat(responseJson.toString(), equalTo("[]"));
	    }
*/}