package org.single;

public class Sum {
	private int add() {
	int a=10 , b= 20;
	int c =a+b;
	System.out.println(c);
	return c;
}
	public static void main(String[] args) {
	Sum s = new Sum();
	int a = s.add();
	System.out.println(a/2);
	
	
	}

}
