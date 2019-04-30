package com.oops.polymorphism;

/**
 * Java Runtime Polymorphism with Data Member
 * 
 * A method can be overridden, not the data members, so runtime polymorphism
 * can't be achieved by data members. In the example given below, both the
 * classes have a data member speedlimit. We are accessing the data member by
 * the reference variable of Parent class which refers to the subclass object.
 * Since we are accessing the data member which is not overridden, hence it will
 * access the data member of the Parent class always.
 * 
 * Rule: Runtime polymorphism can't be achieved by data members.
 */
class RuntimePolymorphismDataMemberParent {
	public int speedlimit = 90;
}

public class RuntimePolymorphismDataMemberChild extends RuntimePolymorphismDataMemberParent {
	public int speedlimit = 150;

	public static void main(String[] args) {

		RuntimePolymorphismDataMemberParent obj = new RuntimePolymorphismDataMemberChild();
		System.out.println(obj.speedlimit);// 90

	}

}
