package org.sperez.spring.demo.ws;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {

	@RequestMapping(method=RequestMethod.GET, value="/hello")
	public String hello(@RequestParam(value="name", defaultValue="World") String name) {
		return "Hello " + name + "!";
	}
	
}
