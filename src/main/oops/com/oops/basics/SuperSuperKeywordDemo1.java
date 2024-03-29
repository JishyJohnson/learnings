package com.oops.basics;

/**
 * In Java, a class cannot directly access the grandparentís members.Compiler
 * Error occurs In Java, we can access grandparentís members only through the
 * parent class.
 * 
 */
class Grandparent {
	public void Print() {
		System.out.println("Grandparent's Print()");
	}
}

class Parent extends Grandparent {
	@Override
	public void Print() {
		System.out.println("Parent's Print()");
	}
}

class Child extends Parent {
	@Override
	public void Print() {
	super.Print(); // Trying to access Grandparent's Print() Compiler Error occurs
		/*super.super.Print();*/ // Trying to access Grandparent's Print() Compiler Error occurs

		System.out.println("Child's Print()");
	}
}

public class SuperSuperKeywordDemo1 {
	public static void main(String[] args) {
		Child c = new Child();
		c.Print();
	}
}