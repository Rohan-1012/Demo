package com.velocity.project;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Java");
		list.add("Hibernate");
		list.add("SpringBoot");
		list.add("BootStrap");
		
		for(String str: list) {
			System.out.println(str);
		}
		
//		System.out.println(list);
		
			
	}

}
