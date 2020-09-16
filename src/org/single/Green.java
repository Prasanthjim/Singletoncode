package org.single;

public class Green {
	static Green g;

	public Green() {
		System.out.println("THIS IS SINGLETON");
	}

	public static Green empId() {
		if (g == null) {
			g = new Green();
			System.out.println("Know constructor");
		}
		return g;
	}

	public void empName() {
		System.out.println("My name is Jim");
	}

	public static void main(String[] args) {
      Green e = empId();
      e.empName();
	}

}
