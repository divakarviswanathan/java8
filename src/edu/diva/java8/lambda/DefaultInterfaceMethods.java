package edu.diva.java8.lambda;

interface int1 {
	default void method1() {
		System.out.println("int1");
	}
}

interface int2 {
	default void method1() {
		System.out.println("int2");
	}
}
public class DefaultInterfaceMethods implements int1, int2{

	public static void main(String[] args) {
		DefaultInterfaceMethods d = new DefaultInterfaceMethods();
		d.method1();
	}

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		int2.super.method1();
	}

}
