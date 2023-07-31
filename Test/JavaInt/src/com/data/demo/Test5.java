package com.data.demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

//{11,34,33,22,90,45,88}

public class Test5 {

	public static void main(String[] args) {	
		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(11);
		l.add(34);
		l.add(33);
		l.add(22);
		l.add(90);
		l.add(45);
		l.add(88);
		
		l.stream().filter(e -> e % 11 ==0 ).forEach(System.out::println);
		
		l.stream().filter(e -> e % 11 ==0 ).collect(Collectors.toList());
		
		Integer sum = l.stream().mapToInt(i -> i).sum();
		System.out.println(sum);
		
//		int sum=0;
		List<Integer> i = l.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
		System.out.println(i);
	}

}
