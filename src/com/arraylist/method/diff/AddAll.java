package com.arraylist.method.diff;

import java.util.ArrayList;
import java.util.Arrays;


public class AddAll {

	public static void main(String[] args) {
		
		ArrayList <String> al = new ArrayList <String>();
		al.add("Java");
		al.add("php");
		al.add("spring");
		al.add("php");
		al.add("python");
		al.add("php");
		
		ArrayList <String> al2 = new ArrayList <String>();
		
		al2.add("mysql");
		al2.add("Oracle");
		//addAll()
		al.addAll(al2);
		System.out.println(al);
		
		//clear();
		//al.clear();
		//System.out.println(al);
		
		//contains()
		System.out.println(al2.contains("python"));
		
		//IndexOf
		System.out.println(al2.indexOf("Oracle"));
		
		//lastIndexOf
		
		System.out.println(al.lastIndexOf("Java"));
		
		//remove
		ArrayList <String> al3 = new ArrayList <String>();
		al3.add("Java");
		al3.add("php");
		al3.add("spring");
		al3.remove(2);
		System.out.println(al3);
		al3.remove("Java");
		System.out.println(al3);
		
		//remove if
		ArrayList <Integer> num = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		
		num.removeIf(number -> number%2 == 0);
		System.out.println(num);
		
		
		
		
	}

}
