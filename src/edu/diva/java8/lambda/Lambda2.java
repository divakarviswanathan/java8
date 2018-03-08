package edu.diva.java8.lambda;

import java.util.Arrays;
import java.util.List;

interface SL2 {
	int incrementBy5(int n);
}
public class Lambda2 {
public static void main(String[] args) {
	SL2 s = new SL2() { 
		public int incrementBy5(int n) {
			return n+5;
		}
	};
	System.out.println(s.incrementBy5(5));
	
	SL2 s1 = n -> n+5;
	System.out.println(s1.incrementBy5(10));
	
	List<String> l1 = Arrays.asList("a","b","c");
	"".compareToIgnoreCase("");
	l1.forEach(e -> System.out.println(e));
}
}
