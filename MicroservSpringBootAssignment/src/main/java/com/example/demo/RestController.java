package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

@org.springframework.web.bind.annotation.RestController
public class RestController {
	
	@Autowired
	GeneralSrvice gsrvc;
	
	@GetMapping("/hi")
	public String test()
	{

	    final String uri = "http://localhost:9001/getAllUsr";

	    RestTemplate restTemplate = new RestTemplate();
	    String result = restTemplate.getForObject(uri, String.class);

	    System.out.println(result);
	    
		return result;
	}

	@GetMapping("/getAllUsr")
	public List getAllUsr()
	{
		List lst = gsrvc.getUsr();
		return lst;
	}
	
	@GetMapping("/getAllbooks")
	public List getAllbooks() {
		
		List<Books> buklst = gsrvc.getAllBooks();
		return buklst;
	}
}
