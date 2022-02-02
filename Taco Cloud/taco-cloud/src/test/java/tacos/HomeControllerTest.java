package tacos;

import static org.hamcrest.CoreMatchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

//import org.hamcrest.Matcher;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;



/**
 * 
 * @author aditya.mishra
 * 
 * @WebMvc: Special Test annotation provided by Spring Boot that arranges for the test to run in the context of a spring MVC application
 * 			more specifically in this case it arranges for HomeController to be registered in spring MVC so that you can throw request against 
 * 			it. It also sets up spring support for testing spring MVC.  
 */


@RunWith(SpringRunner.class)
@WebMvcTest(HomeController.class)
public class HomeControllerTest {
	
	/*
	 * MockMvc : Main entry point for server-side Spring MVC test support.
	 * test class is injected with MockMvc object for the test to drive the mockup.
	 */
	@Autowired
	private MockMvc mockMvc;
	
	@Test
	public void testHomePage() throws Exception{
		mockMvc.perform(get("/"))
		.andExpect(status().isOk())
		.andExpect(view().name("home"))
		.andExpect(content().string(
				containsString("Welcome to...")));		
	}
}
