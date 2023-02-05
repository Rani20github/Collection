package com.practice.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class Iteration {

	public static void main(String[] args) {
		
		ArrayList <String> al = new ArrayList<String>();
		
		al.add("Rani");
		al.add("Shital");
		al.add("chetana");
		al.add("Suraj");
		al.add("Swaroop");
		
		//for loop
		for(int i=0; i<=al.size()-1; i++) {
			System.out.println("For loop = " + al.get(i));
		}
		
		System.out.println("---------------------------------");
		//for each loop
		for(String s : al) {
			System.out.println("for each loop = " + s);
		}	
		System.out.println("---------------------------------");
		
		// Iterator
		
		Iterator<String> it = al.iterator();
		while(it.hasNext()) {
			System.out.println("Using Iterator = " + it.next());
		}
		
			
			
			
		}
	}


