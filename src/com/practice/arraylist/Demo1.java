package com.practice.arraylist;

import java.util.ArrayList;

public class Demo1 {

	public static void main(String[] args) {
		
		ArrayList<Object> al = new ArrayList<Object>();
		
		al.add(101);
		al.add("Shital");
		al.add("Java Developer");
		al.add(50000);
		
		System.out.println(al);
		System.out.println(al.get(3));
		System.out.println(al.get(2));
		System.out.println(al.size());
		System.out.println("Lowest Index = " + 0);
		System.out.println("Highest Index = " + (al.size()-1));
		
		al.add(28);
		al.add("Pune");
		System.out.println(al);
		
		System.out.println(al.size());
}

}
