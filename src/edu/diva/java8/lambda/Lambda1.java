package edu.diva.java8.lambda;

interface SampleL1 {
	void printSomething();
}
public class Lambda1 {

	public static void main(String[] args) {
		SampleL1 s = () -> System.out.println("Print it");
		s.printSomething();
	}

}
