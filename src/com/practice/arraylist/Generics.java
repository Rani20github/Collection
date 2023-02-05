package com.practice.arraylist;

import java.util.ArrayList;

public class Generics {

	public static void main(String[] args) {
		
		ArrayList <Integer> al = new ArrayList<Integer>();
		
		al.add(100);
		al.add(200);
		al.add(300);
		
		System.out.println(al);
		
		ArrayList <String> al2 = new ArrayList<String> ();
		
		al2.add("Shital");
		al2.add("Rani");
		al2.add("chetana");
		
		System.out.println(al2);
		
		

	}

}
