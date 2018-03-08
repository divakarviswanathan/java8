package edu.diva.java8.lambda;

class MR {
	MR() {
		System.out.println("inside MR line 1");
		System.out.println("inside MRline 2");
		System.out.println("inside MR line3 ");
	}
	public static void mrMethod() {
		System.out.println("inside MR Static");
	}
	
	public void mrMethod2() {
		System.out.println("Instance method");
	}
	
	static class MRStatic {
		MRStatic() {
			System.out.println("inside MR");
		}
		public static void mrstMethod() {
			System.out.println("inside MR Static");
		}
		
		public void mrMethod2Sta() {
			System.out.println("Instance method");
		}	
	}
	
	class MR2 {
		MR2() {
			System.out.println("inside MR");
		}
		
		public void mrMethod22() {
			System.out.println("Instance method");
		}	
	}
}

public class MethodReference {

	public static void main(String[] args) {
		MR m = new MR();
		Runnable r = m::mrMethod2;
		Runnable r1 = MR::new;
		Runnable r2= MR::mrMethod;
		
	}

}
