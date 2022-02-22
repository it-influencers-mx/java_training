package com.accenture.chapter1.repaso;

public class ScopeVariables {

	static int x;
	boolean h;
	
	{
		int j = 0;
		System.out.println(x);
	}
	
	public static void main(String[] args) {
		//System.out.println(j); // No compila
		System.out.println(x);
		System.out.println(new ScopeVariables().h);
		//System.out.println(h); //No compila
		System.out.println(new ScopeVariables().x);
	}
	
	private void main() {}
	
	private void $(long n) {
		String m; int l = 0;
		
		//if(m == null) { // No compila
		if(l == 0) {
			int k = 1;
			
			System.out.println(k);
			// System.out.println(j); // No compila
			System.out.println(x);
			System.out.println(h);
			
			{
				if(n == 1) {
					System.out.println(n);
				}
			}
		} else {
			// boolean m1 = k == 1; //No compila
		}
		
		// System.out.println(m); // No compila
	}
	
}
