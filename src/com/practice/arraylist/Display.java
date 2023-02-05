package com.practice.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Display {

	public static void main(String[] args) {
		
		ArrayList <Integer> al = new ArrayList<Integer>(Arrays.asList(10,20,49,50));
		System.out.println(al);
		
		for(Integer s : al) {
			System.out.println(s);
		}
			System.out.println("------------------------------------");
			
			Iterator <Integer> it = al.iterator();
			while(it.hasNext()) {
				System.out.println(it.next());
			}
		}

	}


