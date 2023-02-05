package com.practice.arraylist;

import java.util.ArrayList;

public class VirtualCapacity {

	public static void main(String[] args) {
		
		ArrayList <Object> al = new ArrayList <Object>();
		System.out.println(al.size());
		
		al.add(100);
		al.add(200);
		al.add(200);
		
		System.out.println(al.size());
		
	}

}
