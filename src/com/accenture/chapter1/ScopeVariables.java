package com.accenture.chapter1;

public class ScopeVariables {
	
	int instanceVariableNumber = 1;
	boolean instanceVariableBoolean;
	static String someString = "Test";
	
	public void test(int number){
		
		if(number > 0) {
			int numberWithinIf = 1;
			{
				int otherNumber = 1;
				System.out.println(number);
				
				if(otherNumber == 1) {
					System.out.println(otherNumber);
					System.out.println(number);
				}
			}
			
			//System.out.println(otherNumber); // No compila, out of scope
			System.out.println(number);
		} else {
			//System.out.println(numberWithinIf); // No compila, out of scope
		}
	}
	
	public void test2() {
		System.out.println(instanceVariableNumber);
		System.out.println(instanceVariableBoolean);
		System.out.println(someString);
		System.out.println(ScopeVariables.someString);
	}
	
	public static void main(String[] args) {
		ScopeVariables scopeVariables = new ScopeVariables();
		
		System.out.println(scopeVariables.instanceVariableNumber);
		System.out.println(scopeVariables.instanceVariableBoolean);
		System.out.println(scopeVariables.someString);
		System.out.println(ScopeVariables.someString);
	}
}
