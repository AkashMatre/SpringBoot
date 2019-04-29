package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class GeneralSrvice {

	
	private static List<User> usrlst = new ArrayList();
	private static List<Books> bkslst = new ArrayList(); 
	
	
	static{
			usrlst.add(new User(1,"Akash Matre","Pune","9665204016"));
			usrlst.add(new User(2,"Anup Tiwari","Pune","9665204016"));
			usrlst.add(new User(3,"Ram Chopade","Nagpur","9665204016"));
			usrlst.add(new User(4,"Rupali Bachalkar","Wardha","8380824882"));	
	}
	
	static{
		
		bkslst.add(new Books(1,"Lets C","Y. Kanetkar","Y"));
		bkslst.add(new Books(2,"Core Java","e Balguruswami","Y"));
		bkslst.add(new Books(3,"Node Js","Ryan Dhal","Y"));
		bkslst.add(new Books(4,"Hibernet","Gaven King","N"));	
}
	
	public List<User> getUsr()
	{
		return usrlst; 
	}
	public List<Books> getAllBooks()
	{
		return bkslst;
	}
}
