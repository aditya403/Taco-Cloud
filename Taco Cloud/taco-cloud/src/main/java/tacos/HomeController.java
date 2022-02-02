package tacos;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


/*
 * @Controller is to identify this class as a component at the time of component scanning 
 * and it creates an instance of HomeController as a bean in the spring application context.
 * Here any annotation like @Service, @Repository serve the same purpose as @Controller but
 * @Controller is for a special purpose
 */
@Controller  
public class HomeController {
	
	/*
	 * @GetMapping to indicate that if an HTTP GET request for the root('/') path then this method
	 * should handle the request.
	 */
	@GetMapping  
	public String Home() {
		return "home";
	}
}
